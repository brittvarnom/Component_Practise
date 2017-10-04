package britt.com.component_practise_all.Beginner.UserPromptsActivity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import britt.com.component_practise_all.R
import kotlinx.android.synthetic.main.activity_user_prompts.*

class UserPromptsActivity : AppCompatActivity(), CustomDialogFragment.UserNameDialogListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_prompts)
        setUpButtons()
    }

    override fun onFinishUserDialog(username: String) {
        Toast.makeText(this, "Hello, $username!", Toast.LENGTH_SHORT).show()
    }

    private fun setUpButtons() {
        btn_user_prompts_snackbar.setOnClickListener {
            Snackbar.make(it, "Snackbar Button Clicked.", Snackbar.LENGTH_SHORT)
                .show()
        }
        btn_user_prompts_toast.setOnClickListener {
            Toast.makeText(this, "Toast Button Clicked.", Toast.LENGTH_LONG)
                .show()
        }
        btn_user_prompts_dialog.setOnClickListener {
            dialogClick()
        }
        btn_user_prompts_alert_dialog.setOnClickListener {
            alertDialogClick()
        }
    }

    private fun dialogClick() {
        val manager = fragmentManager
        val customDialogFragment = CustomDialogFragment()
        customDialogFragment.show(manager, "dialog_tag")
    }
    private fun alertDialogClick() {
        val manager = fragmentManager
        val customAlertDialogFragment = CustomAlertDialogFragment()
        customAlertDialogFragment.show(manager, "dialog_tag")
    }

}