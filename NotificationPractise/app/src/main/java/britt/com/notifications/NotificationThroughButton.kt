package britt.com.notifications

import android.app.PendingIntent

interface NotificationThroughButton {
    fun setNotificationStack(): PendingIntent?
    fun initialiseNotification()
    fun sendNotificationOnButtonClick()
}