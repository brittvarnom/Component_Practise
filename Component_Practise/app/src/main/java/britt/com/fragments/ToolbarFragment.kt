package britt.com.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ToolbarFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        -------------------------
//        Maybe keep? Who knows
//        -------------------------
//        val view = inflater?.inflate(R.layout.layout_toolbar_fragment, container, false)
//        return view
//        -------------------------
        return inflater?.inflate(R.layout.layout_toolbar_fragment, container, false)
    }
}