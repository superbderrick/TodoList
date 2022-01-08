package jinyoung.dev.todolist.ui.shopinglist

import androidx.lifecycle.ViewModel
import jinyoung.dev.todolist.data.db.entities.ShoppingItem
import jinyoung.dev.todolist.repositories.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ActionItemViewModel(
    private val repository : ShoppingRepository
) : ViewModel(){
    fun upsert(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }

    fun delete(item: ShoppingItem) = CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }

    fun getAllShoppingItems() =repository.getAllShoppingItems()
}