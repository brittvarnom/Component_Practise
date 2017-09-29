package britt.com.component_practise_all

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import britt.com.component_practise_all.Beginner.*
import britt.com.component_practise_all.Beginner.ActivityTask.FirstActivity
import britt.com.component_practise_all.Beginner.FragmentActivity.FragmentActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.nav_drawer_app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val toggleDrawer = ActionBarDrawerToggle(
            this,
            drawer_layout,
            toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close)

        drawer_layout.addDrawerListener(toggleDrawer)
        toggleDrawer.syncState()

        nav_view.setNavigationItemSelectedListener(this)

    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    private fun startActivity(javaClass: Class<*>) {
        val intent = Intent(this@MainActivity, javaClass)
        startActivity(intent)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
        //Beginner
            R.id.logging -> {
                startActivity(LoggingActivity::class.java)
            }
            R.id.activities -> {
                startActivity(FirstActivity::class.java)
            }
            R.id.fragments -> {
                startActivity(FragmentActivity::class.java)
            }
            R.id.user_prompts -> {
                startActivity(UserPromptsActivity::class.java)
            }
            R.id.notifications -> {
                startActivity(NotificationsActivity::class.java)
            }
            R.id.view_class -> {
                startActivity(ViewClassActivity::class.java)
            }

        //Intermediate
            R.id.intent_service -> {
                return true
            }
            R.id.broadcast_recievers -> {
                return true
            }
            R.id.recycler_view -> {
                return true
            }
            R.id.http_networking -> {
                return true
            }
            R.id.shared_preferences -> {
                return true
            }
            R.id.web_view -> {
                return true
            }
            R.id.toolbar -> {
                return true
            }
            R.id.menu -> {
                return true
            }
            R.id.sharing -> {
                return true
            }

        //Advanced
            R.id.mvp -> {
                return true
            }
            R.id.custom_views -> {
                return true
            }
            R.id.sqllite -> {
                return true
            }
            R.id.fragment_communication -> {
                return true
            }
            R.id.advanced_recyclerview -> {
                return true
            }
            R.id.bottom_bar_nav -> {
                return true
            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}