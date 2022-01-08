package jinyoung.dev.todolist.ui

import android.content.Context
import android.os.Bundle
import android.view.Window
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import jinyoung.dev.todolist.R
import jinyoung.dev.todolist.data.db.entities.ActionItem

class AddActionItemDialog(context: Context, var addDialogListener: AddDialogListener) :
    AppCompatDialog(context) {

    lateinit var tvAdd : TextView
    lateinit var tvCancel : TextView

    lateinit var etName : EditText
    lateinit var etAmount : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.dialog_add_action_item)
        tvAdd = findViewById(R.id.tvAdd)!!
        tvCancel = findViewById(R.id.tvCancel)!!
        etName = findViewById(R.id.etName)!!
        etAmount = findViewById(R.id.etAmount)!!


        tvAdd.setOnClickListener {
            val name = etName.text.toString()
            val amount = etAmount.text.toString().toInt()
            if(name.isNullOrEmpty()) {
                Toast.makeText(context, "Please enter a name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val item = ActionItem(name, amount)
            addDialogListener.onAddButtonClicked(item)
            dismiss()
        }

        tvCancel.setOnClickListener {
            cancel()
        }
    }
}