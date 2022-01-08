package jinyoung.dev.todolist.ui.shopinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import jinyoung.dev.todolist.repositories.ShoppingRepository

class ShoppingViewModelFactory(
    private val repository : ShoppingRepository
)  : ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ActionItemViewModel(repository) as T
    }
}