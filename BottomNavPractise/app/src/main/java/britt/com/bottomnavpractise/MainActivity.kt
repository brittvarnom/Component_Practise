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
        bottom_nav.menu.add(0, 0, 0, "Notifications")
            .setIcon(R.drawable.ic_second)
        bottom_nav.menu.add(0, 0, 0, "Home")
            .setIcon(R.drawable.ic_main)
        bottom_nav.menu.add(0, 0, 0, "About")
            .setIcon(R.drawable.ic_third)
    }
}
