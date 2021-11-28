package com.example.bagusriankusuma

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)
        val clearButton = findViewById<Button>(R.id.clearButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val npmEditText = findViewById<EditText>(R.id.npmEditText)
        val kelasEditText = findViewById<EditText>(R.id.kelasEditText)
        val matkulEditText = findViewById<EditText>(R.id.matkulEditText)
        val hobiEditText = findViewById<EditText>(R.id.hobiEditText)

        simpanButton.setOnClickListener{
            val nama = namaEditText.text.toString()
            val npm = npmEditText.text.toString().toInt()
            val kelas = kelasEditText.text.toString()
            val matkul = matkulEditText.text.toString()
            val hobi = hobiEditText.text.toString()


            Toast.makeText(this,"Data Berhasil Disimpan!",Toast.LENGTH_SHORT).show()

            val intent = Intent(this,HasilActivity::class.java)
            intent.putExtra("nama",nama)
            intent.putExtra("npm",npm)
            intent.putExtra("kelas",kelas)
            intent.putExtra("matkul",matkul)
            intent.putExtra("hobi",hobi)
            startActivity(intent)
        }

        clearButton.setOnClickListener{
            namaEditText.setText("")
            npmEditText.setText("")
            kelasEditText.setText("")
            matkulEditText.setText("")
            hobiEditText.setText("")
        }

        batalButton.setOnClickListener{
            finish()
        }

    }
}