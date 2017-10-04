package britt.com.component_practise_all.Beginner.UserPromptsActivity

import android.app.DialogFragment
import android.os.Bundle
import android.view.*
import android.widget.EditText
import android.widget.TextView
import britt.com.component_practise_all.R
import kotlinx.android.synthetic.main.fragment_username.*

class CustomDialogFragment: DialogFragment(), TextView.OnEditorActionListener {

    interface UserNameDialogListener {
        fun onFinishUserDialog(username: String)
    }

    private lateinit var editText : EditText

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_username, container)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        editText = user_name_entry
        editText.setOnEditorActionListener(this)
        editText.requestFocus()
        dialog.window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE)
        dialog.setTitle(R.string.description_fragment_custom)
    }


    override fun onEditorAction(p0: TextView?, p1: Int, p2: KeyEvent?): Boolean {
        val activity = activity as UserNameDialogListener
        activity.onFinishUserDialog(editText.text.toString())
        this.dismiss()
        return true
    }
}