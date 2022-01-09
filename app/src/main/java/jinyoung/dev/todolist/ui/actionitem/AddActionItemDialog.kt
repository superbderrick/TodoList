package jinyoung.dev.todolist.ui

import android.content.Context
import android.os.Bundle
import android.view.Window
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import jinyoung.dev.todolist.R
import jinyoung.dev.todolist.data.db.entities.ActionItem
import kotlinx.android.synthetic.main.dialog_add_action_item.*

class AddActionItemDialog(context: Context, var addDialogListener: AddDialogListener) :
    AppCompatDialog(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_add_action_item)

        tvAdd.setOnClickListener {
            val name = etName.text.toString()
            if(name.isNullOrEmpty()) {
                Toast.makeText(context, "Please enter a name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val item = ActionItem(name, 0,false)
            addDialogListener.onAddButtonClicked(item)
            dismiss()
        }

        tvCancel.setOnClickListener {
            cancel()
        }
    }
}