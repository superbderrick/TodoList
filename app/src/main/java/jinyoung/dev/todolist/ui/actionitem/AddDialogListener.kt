package jinyoung.dev.todolist.ui

import jinyoung.dev.todolist.data.db.entities.ActionItem


interface AddDialogListener {
    fun onAddButtonClicked(item: ActionItem)
}