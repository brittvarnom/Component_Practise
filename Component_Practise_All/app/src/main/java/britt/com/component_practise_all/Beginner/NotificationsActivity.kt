package britt.com.component_practise_all.Beginner

import android.app.NotificationManager
import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Color
import android.media.RingtoneManager
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.support.v7.app.AppCompatActivity
import britt.com.component_practise_all.R
import kotlinx.android.synthetic.main.activity_notifications.*

class NotificationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifications)
        sendNotification()
    }

    private fun sendNotification() {
        btn_notifications_send.setOnClickListener {
            val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            val soundUrl = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
            val notificationChannelId = "2023129917"
            val notificationBuilder : NotificationCompat.Builder = NotificationCompat.Builder(this, notificationChannelId)
                .setSmallIcon(R.drawable.ic_notifications)
                .setContentTitle("Notification Recieved")
//                .setContentText("This notification was created via a NotificationBuider.")
                // Instead of setContentText. This version displays all text in the notification.
                .setStyle(NotificationCompat.BigTextStyle().bigText("This notification was created via a NotificationBuider. " +
                    "This text was set via 'setStyle' instead of 'setContentText' to allow all text to be shown."))
                .setColor(resources.getColor(R.color.colorPrimary, resources.newTheme()))
                .setSound(soundUrl)
            notificationManager.notify(notificationChannelId.toInt(), notificationBuilder.build())
        }
    }
}
