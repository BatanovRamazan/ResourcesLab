package com.example.resourceslab

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    private val tag = "DetailActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        Log.d(tag, "onCreate")

        val student = intent.getStringExtra("EXTRA_STUDENT") ?: "Неизвестно"
        val grade = intent.getIntExtra("EXTRA_GRADE", 0)

        findViewById<TextView>(R.id.tvStudentName).text = student

        findViewById<TextView>(R.id.tvGrade).text =
            getString(R.string.grade_text, grade)

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            Log.i(tag, "Нажата кнопка Назад")
            finish()
        }
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