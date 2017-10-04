package britt.com.component_practise_all.Beginner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import britt.com.component_practise_all.R
import kotlinx.android.synthetic.main.activity_logging.*

class LoggingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logging)
        setLogButtonOnClickListener()
    }

    fun setLogButtonOnClickListener() {
        btn_log_e.setOnClickListener {
            Log.e(">>>>LOGGING ACTIVITY", "'Log Error Message' button was clicked.")
        }

        btn_log_d.setOnClickListener {
            Log.d(">>>>LOGGING ACTIVITY", "'Log Debug Message' button was clicked.")
        }

        btn_log_w.setOnClickListener {
            Log.w(">>>>LOGGING ACTIVITY", "'Log Warning Message' button was clicked.")
        }
    }


}