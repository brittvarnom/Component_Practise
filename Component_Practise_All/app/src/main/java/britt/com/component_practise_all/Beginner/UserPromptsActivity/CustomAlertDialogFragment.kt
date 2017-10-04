package britt.com.component_practise_all.Beginner.UserPromptsActivity

import android.app.AlertDialog
import android.app.Dialog
import android.app.DialogFragment
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import britt.com.component_practise_all.R

class CustomAlertDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(activity)
            .setIcon(R.drawable.ic_user_prompts)
            .setTitle(R.string.title_fragment_custom_dialog)
            .setMessage(R.string.description_fragment_custom_dialog_alert)
            .setPositiveButton(R.string.button_fragment_custom_dialog, DialogInterface.OnClickListener {
                _, _ ->
                Toast.makeText(activity, "OK clicked", Toast.LENGTH_SHORT).show()
            })
            .setNegativeButton(R.string.button_fragment_custom_dialog_cancel, DialogInterface.OnClickListener {
                _, _ ->
                Toast.makeText(activity, "Cancel clicked", Toast.LENGTH_SHORT).show()
            })
            .create()
    }
}