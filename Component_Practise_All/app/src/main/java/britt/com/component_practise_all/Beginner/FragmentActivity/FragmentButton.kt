package britt.com.component_practise_all.Beginner.FragmentActivity

import android.app.Application
import android.app.Fragment
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import britt.com.component_practise_all.MainActivity
import britt.com.component_practise_all.R
import kotlinx.android.synthetic.main.fragment_two.*

class FragmentButton: Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_two, container, false)
    }

    fun setClickListener(context: Context) {
        btn_fragment_home.setOnClickListener {
            val intent = Intent(getContext(), MainActivity::class.java)
            startActivity(intent)
        }
    }
}


