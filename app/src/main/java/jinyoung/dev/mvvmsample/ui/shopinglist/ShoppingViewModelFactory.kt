package jinyoung.dev.mvvmsample.ui.shopinglist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import jinyoung.dev.mvvmsample.repositories.ShoppingRepository

class ShoppingViewModelFactory(
    private val repository : ShoppingRepository
)  : ViewModelProvider.NewInstanceFactory(){
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ShoppingViewModel(repository) as T
    }
}