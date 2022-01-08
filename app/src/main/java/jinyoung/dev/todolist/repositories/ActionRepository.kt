package jinyoung.dev.todolist.repositories

import jinyoung.dev.todolist.data.db.ActionDatabase
import jinyoung.dev.todolist.data.db.entities.ActionItem

class ActionRepository(
    private val db: ActionDatabase
) {
    suspend fun upsert(item: ActionItem) = db.getActionDao().upsert(item)

    suspend fun delete(item: ActionItem) = db.getActionDao().delete(item)

    fun getAllActionItems() = db.getActionDao().getAllActionItems()
}