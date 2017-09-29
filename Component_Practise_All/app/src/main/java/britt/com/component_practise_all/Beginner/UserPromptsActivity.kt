package britt.com.component_practise_all.Beginner

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import britt.com.component_practise_all.R
import kotlinx.android.synthetic.main.activity_user_prompts.*

class UserPromptsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_prompts)
        setUpButtons()
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

        }
    }
}
