package britt.com.notifications

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var notificationTapCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sendNotificationOnButtonClick()
        clearNotificationTapCount()
    }

    fun initialiseNotification() {
        //Initalises the intent for the activity the notification will send the user to
        val notificationTargetIntent = Intent(this, NotificationTargetActivity::class.java)
        //Initialises the notification object
        val notificationBuilder = Notification.Builder(this)
            .setSmallIcon(R.drawable.ic_notification_small)
            .setContentTitle("NOTIFICATION SENT")
            .setContentText("Recieve notification button tapped $notificationTapCount times.")
            .setCategory(Notification.CATEGORY_EVENT)
            .setPriority(Notification.PRIORITY_HIGH)

        //Ensures navigating out opf the activity leads to the home screen
        val taskStackBuilder = TaskStackBuilder.create(this)
        //adds intent's backstack
        taskStackBuilder.addParentStack(MainActivity::class.java)
        //adds the intent to start the next activity into the top of the stack
        taskStackBuilder.addNextIntent(notificationTargetIntent)
        val targetPendingIntent = taskStackBuilder.getPendingIntent(
            0,
            PendingIntent.FLAG_UPDATE_CURRENT)

        val notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        //id can be anything, in this case is h/mm/ss/d/m/yy
        notificationManager.notify(345257817, notificationBuilder.build())
    }

    fun sendNotificationOnButtonClick() {

        button_receive_notifications.setOnClickListener {
            try {
                notificationTapCount++
                initialiseNotification()
            } catch (e: Exception) {
                Snackbar.make(it,
                    "Notifications not set up yet. This message will be displayed instead.",
                    Snackbar.LENGTH_LONG).show()
            }
        }
    }

    fun clearNotificationTapCount() {
        button_clear_tap_count.setOnClickListener {
            notificationTapCount = 0
            Snackbar.make(it, "Notification tap count cleared.", Snackbar.LENGTH_SHORT).show()
        }
    }
}
