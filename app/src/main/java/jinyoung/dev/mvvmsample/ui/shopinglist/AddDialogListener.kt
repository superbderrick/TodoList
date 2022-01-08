package jinyoung.dev.mvvmsample.ui

import jinyoung.dev.mvvmsample.data.db.entities.ShoppingItem


interface AddDialogListener {
    fun onAddButtonClicked(item: ShoppingItem)
}