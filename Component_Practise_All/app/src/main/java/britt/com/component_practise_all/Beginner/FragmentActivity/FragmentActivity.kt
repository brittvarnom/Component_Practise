package britt.com.component_practise_all.Beginner.FragmentActivity

import android.app.Fragment
import android.app.FragmentManager
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import britt.com.component_practise_all.MainActivity
import britt.com.component_practise_all.R
import kotlinx.android.synthetic.main.activity_fragment.*
import kotlinx.android.synthetic.main.fragment_two.*

class FragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        setUpFragments()
    }

    private fun setUpFragments() {
        val fragmentImage = FragmentImage()
        val fragmentButton = FragmentButton()

        fragmentManager.beginTransaction()
            .replace(R.id.fragment_activity_one_container, fragmentImage)
            .commit()

        fragmentManager.beginTransaction()
            .replace(R.id.fragment_activity_two_container, fragmentButton)
            .commit()

    }
}
