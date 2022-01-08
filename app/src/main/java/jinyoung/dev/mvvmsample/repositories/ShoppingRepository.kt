package jinyoung.dev.mvvmsample.repositories

import jinyoung.dev.mvvmsample.data.db.ShoppingDatabase
import jinyoung.dev.mvvmsample.data.db.entities.ShoppingItem

class ShoppingRepository(
    private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}