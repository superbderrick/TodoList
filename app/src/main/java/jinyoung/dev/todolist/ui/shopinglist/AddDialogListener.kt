package jinyoung.dev.todolist.ui

import jinyoung.dev.todolist.data.db.entities.ShoppingItem


interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}