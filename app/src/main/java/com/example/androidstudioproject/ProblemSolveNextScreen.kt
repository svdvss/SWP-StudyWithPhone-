package com.example.androidstudioproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ProblemSolveNextScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.problem_solve_next)

        val grade = intent.getStringExtra("학년").toString()
        val subject = intent.getStringExtra("과목").toString()
        val answerRate : Int = intent.getIntExtra("정답률", 100)

        intent = Intent(this, ProblemSolveScreen::class.java)

        intent.putExtra("정답률", answerRate)
        intent.putExtra("학년", grade)
        intent.putExtra("과목", subject)
    }

    override fun onBackPressed() {
        startActivity(Intent(this, BasicScreen::class.java))
    }

    fun home(v : View){
        startActivity(Intent(this, BasicScreen::class.java))
    }

    fun toProblemSolve(v : View){
        startActivity(intent)
    }
}