package com.example.bagusriankusuma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HasilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil)

        val nama = intent.getStringExtra("nama")
        val npm = intent.getIntExtra("npm",0)
        val kelas = intent.getStringExtra("kelas")
        val matkul = intent.getStringExtra("matkul")
        val hobi = intent.getStringExtra("hobi")

        val namaTextView = findViewById<TextView>(R.id.namaTextView)
        val npmTextView = findViewById<TextView>(R.id.npmTextView)
        val kelasTextView = findViewById<TextView>(R.id.kelasTextView)
        val matkulTextView = findViewById<TextView>(R.id.matkulTextView)
        val hobiTextView = findViewById<TextView>(R.id.hobiTextView)

        namaTextView.setText(nama)
        npmTextView.setText(npm.toString())
        kelasTextView.setText(kelas)
        matkulTextView.setText(matkul)
        hobiTextView.setText(hobi)

    }
}