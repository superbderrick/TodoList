package jinyoung.dev.mvvmsample.ui.shopinglist

import androidx.lifecycle.ViewModel
import jinyoung.dev.mvvmsample.data.db.entities.ShoppingItem
import jinyoung.dev.mvvmsample.repositories.ShoppingRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingViewModel(
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