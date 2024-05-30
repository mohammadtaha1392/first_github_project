package com.king.android.p06_first_git_projeect

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText(this, "hello everyone after first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 1", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 2", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "toast number 3", Toast.LENGTH_SHORT).show()

    }
}