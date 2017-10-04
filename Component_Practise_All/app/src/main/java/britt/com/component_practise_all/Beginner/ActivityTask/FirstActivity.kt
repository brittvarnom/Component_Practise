package britt.com.component_practise_all.Beginner.ActivityTask

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import britt.com.component_practise_all.R
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        setButtonClickListener()
    }

    fun setButtonClickListener() {
        btn_second_activity.setOnClickListener {
            val intent = Intent(this@FirstActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
