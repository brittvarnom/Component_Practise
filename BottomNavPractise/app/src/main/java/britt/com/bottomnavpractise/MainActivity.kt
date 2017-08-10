package britt.com.bottomnavpractise

import android.content.res.Resources
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        manageNavBar()
    }

    fun manageNavBar() {
        var timesTappedNotifications = 0
        var timesTappedHome = 0
        var timesTappedAbout = 0
        bottom_nav.menu.add(0, 0, timesTappedNotifications, "Notifications")
            .setIcon(R.drawable.ic_second)
        bottom_nav.menu.add(0, 0, timesTappedHome, "Home")
            .setIcon(R.drawable.ic_main)
        bottom_nav.menu.add(0, 0, timesTappedAbout, "About")
            .setIcon(R.drawable.ic_third)
    }
}
