package jinyoung.dev.mvvmsample.ui.shopinglist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import jinyoung.dev.mvvmsample.R
import jinyoung.dev.mvvmsample.data.db.ShoppingDatabase
import jinyoung.dev.mvvmsample.repositories.ShoppingRepository

class ShoppingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        val database = ShoppingDatabase(this)
        val repository = ShoppingRepository(database)
        val factory = ShoppingViewModelFactory(repository)

        val viewModel = ViewModelProviders.of(this).get(ShoppingViewModel::class.java)
    }
}