package com.example.androidstudioproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.retry_problem.*

class RetryProblemScreen : AppCompatActivity() {

    val DataList = arrayListOf(
        Data(R.drawable.text_background, "0번"),
        Data(R.drawable.text_background, "1번"),
        Data(R.drawable.text_background, "2번"),
        Data(R.drawable.text_background, "3번"),
        Data(R.drawable.text_background, "4번"),
        Data(R.drawable.text_background, "5번"),
        Data(R.drawable.text_background, "6번"),
        Data(R.drawable.text_background, "7번"),
        Data(R.drawable.text_background, "8번"),
        Data(R.drawable.text_background, "9번"),
        Data(R.drawable.text_background, "10번")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.retry_problem)


        retryProblemList.layoutManager = LinearLayoutManager(this)
        retryProblemList.adapter = CustomAdapter(DataList)
    }


    fun home(v : View){
        startActivity(Intent(this, BasicScreen::class.java))
    }
}