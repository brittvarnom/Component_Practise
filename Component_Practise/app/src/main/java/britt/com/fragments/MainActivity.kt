package britt.com.fragments

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import britt.com.fragments.SecondFragmentActivity.SecondImageFragment
import britt.com.fragments.SecondFragmentActivity.SecondTextFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_fragment_containers)
        fun hiddenFunction() {
            //        setContentView(R.layout.fragment_holder)
//
//        val toolbarFragment = ToolbarFragment()
//        val textFragment = TextFragment()
//        val imageFragment = ImageFragment()
//
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.toolbar_fragment_container, toolbarFragment)
//            .commit()
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.text_fragment_container, textFragment)
//            .commit()
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.image_fragment_container, imageFragment)
//            .commit()
        }

        val secondTextFragment = SecondTextFragment()
        val secondImageFragment = SecondImageFragment()

        supportFragmentManager.beginTransaction()
            .replace(R.id.first_fragment_container, secondTextFragment)
            .commit()
        supportFragmentManager.beginTransaction()
            .replace(R.id.second_fragment_container, secondImageFragment)
            .commit()

    }
}
