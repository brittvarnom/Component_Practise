package britt.com.fragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.toolbar_fragment_container)

        val toolbarFragment = ToolbarFragment()

        supportFragmentManager.beginTransaction().replace(R.id.toolbar_fragment_container, toolbarFragment).commit()
    }
}
