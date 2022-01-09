package jinyoung.dev.todolist.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import jinyoung.dev.todolist.R
import jinyoung.dev.todolist.data.db.entities.ActionItem
import jinyoung.dev.todolist.ui.actionitem.ActionItemViewModel
import kotlinx.android.synthetic.main.action_item.view.*


class ActionItemAdapter(
    var items: List<ActionItem>,
    private val viewModel: ActionItemViewModel
): RecyclerView.Adapter<ActionItemAdapter.ActionItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActionItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.action_item, parent, false)
        return ActionItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ActionItemViewHolder, position: Int) {
        val curActionItem = items[position]

        holder.itemView.tvName.text = curActionItem.name
        holder.itemView.statusCheckBox.isChecked = curActionItem.status

        holder.itemView.ivDelete.setOnClickListener {
            viewModel.delete(curActionItem)
        }

        holder.itemView.statusCheckBox.setOnCheckedChangeListener{ _, isChecked ->
            curActionItem.status = isChecked
            viewModel.upsert(curActionItem)
        }


    }

    inner class ActionItemViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}