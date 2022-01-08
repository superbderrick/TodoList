package jinyoung.dev.todolist.ui.actionitem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import jinyoung.dev.todolist.R
import jinyoung.dev.todolist.data.db.entities.ActionItem
import jinyoung.dev.todolist.ui.AddDialogListener
import jinyoung.dev.todolist.ui.AddActionItemDialog
import jinyoung.dev.todolist.ui.adapter.ActionItemAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.kodein.di.KodeinAware
import org.kodein.di.android.kodein
import org.kodein.di.generic.instance

class MainActivity : AppCompatActivity() , KodeinAware {

    override val kodein by kodein()
    private val factory: ActionItemViewModelFactory by instance()

    lateinit var viewModel: ActionItemViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this, factory).get(ActionItemViewModel::class.java)

        val adapter = ActionItemAdapter(listOf(), viewModel)

        rvActionItems.layoutManager = LinearLayoutManager(this)
        rvActionItems.adapter = adapter

        viewModel.getAllActionItems().observe(this, Observer {
            adapter.items = it
            adapter.notifyDataSetChanged()
        })

        fab.setOnClickListener {
            AddActionItemDialog(
                this,
                object : AddDialogListener {
                    override fun onAddButtonClicked(item: ActionItem) {
                        viewModel.upsert(item)
                    }
                }).show()
        }
    }


}