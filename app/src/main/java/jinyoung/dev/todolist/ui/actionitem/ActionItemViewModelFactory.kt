package jinyoung.dev.todolist.ui.actionitem

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import jinyoung.dev.todolist.repositories.ActionRepository

class ActionItemViewModelFactory(
    private val repository : ActionRepository
)  : ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ActionItemViewModel(repository) as T
    }
}