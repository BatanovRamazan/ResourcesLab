package com.example.resourceslab

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity() {

    private val tag = "ListActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        Log.d(tag, "onCreate")

        findViewById<Button>(R.id.btnRamazan).setOnClickListener {
            openStudent("Ramazan", 90)
        }

        findViewById<Button>(R.id.btnAli).setOnClickListener {
            openStudent("Ali", 80)
        }

        findViewById<Button>(R.id.btnOlzhas).setOnClickListener {
            openStudent("Olzhas", 85)
        }

        findViewById<Button>(R.id.btnTimur).setOnClickListener {
            openStudent("Timur", 88)
        }

        findViewById<Button>(R.id.btnAyan).setOnClickListener {
            openStudent("Ayan", 76)
        }

        findViewById<Button>(R.id.btnDaniyar).setOnClickListener {
            openStudent("Daniyar", 92)
        }

        findViewById<Button>(R.id.btnAslan).setOnClickListener {
            openStudent("Aslan", 84)
        }

        findViewById<Button>(R.id.btnArman).setOnClickListener {
            openStudent("Arman", 79)
        }
    }

    private fun openStudent(name: String, grade: Int) {

        Log.i(tag, "Выбран студент: $name")

        val intent = Intent(this, DetailActivity::class.java)

        intent.putExtra("EXTRA_STUDENT", name)
        intent.putExtra("EXTRA_GRADE", grade)

        startActivity(intent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "onDestroy")
    }
}