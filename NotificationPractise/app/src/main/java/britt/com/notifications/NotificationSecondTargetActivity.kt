package britt.com.notifications

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_notification_second_target.*

class NotificationSecondTargetActivity : AppCompatActivity(), NotificationThroughButton {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_second_target)
        val fragmentInflater = FragmentInflater()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragmentInflater)
            .commit()

        sendNotificationOnButtonClick()
    }

    override fun setNotificationStack(): PendingIntent? {
        val notificationTargetIntent = Intent(this, MainActivity::class.java)
        val taskStackBuilder = TaskStackBuilder.create(this)
        taskStackBuilder.addParentStack(NotificationSecondTargetActivity::class.java)
        taskStackBuilder.addNextIntent(notificationTargetIntent)
        return taskStackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
    }

    override fun initialiseNotification() {
        val soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val contentIntent = setNotificationStack()
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notificationBuilder = Notification.Builder(this)
            .setSmallIcon(R.drawable.ic_notification_small)
            .setSubText("Back to home")
            .setContentText("Click to navigate to home screen.")
            .setContentTitle("FINAL NOTIFICATION")
            .setColor(resources.getColor(R.color.colorPrimaryDark))
            .setContentIntent(contentIntent)
            .setSound(soundUri)
            .setAutoCancel(true)
        notificationManager.notify(137149817, notificationBuilder.build())
    }

    override fun sendNotificationOnButtonClick() {
        button_receive_final_notification.setOnClickListener {
            initialiseNotification()
        }
    }
}
