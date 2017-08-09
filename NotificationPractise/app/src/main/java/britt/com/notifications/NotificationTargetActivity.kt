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
import kotlinx.android.synthetic.main.activity_notification_target.*

class NotificationTargetActivity : AppCompatActivity(), NotificationThroughButton {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification_target)
        sendNotificationOnButtonClick()
    }

    override fun setNotificationStack(): PendingIntent? {
        val notificationTargetIntent = Intent(this, NotificationSecondTargetActivity::class.java)
        val taskStackBuilder = TaskStackBuilder.create(this)
        taskStackBuilder.addParentStack(NotificationTargetActivity::class.java)
        taskStackBuilder.addNextIntent(notificationTargetIntent)
        return taskStackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT)
    }

    override fun initialiseNotification() {
        val soundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION)
        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val pendingIntent = setNotificationStack()
        val notificationBuilder = Notification.Builder(this)
            .setSmallIcon(R.drawable.ic_notification_small)
            .setSubText("Second notification")
            .setContentText("Accessed another notification through a notification!")
            .setContentTitle("ANOTHER NOTIFICATION SENT")
            .setColor(resources.getColor(R.color.colorAccent))
            .setSound(soundUri)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
        notificationManager.notify(936339817, notificationBuilder.build())
    }

    override fun sendNotificationOnButtonClick() {
        button_receive_second_notification.setOnClickListener {
            initialiseNotification()
        }
    }
}