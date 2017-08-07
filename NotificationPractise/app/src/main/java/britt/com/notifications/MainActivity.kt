package britt.com.notifications

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sendNotificationOnButtonClick()
    }

    fun sendNotificationOnButtonClick() {
        button_receive_notifications.setOnClickListener {
            Snackbar.make(it,
                "Notifications not set up yet. This message will be displayed insstead.",
                Snackbar.LENGTH_LONG).show()
        }
    }
}
