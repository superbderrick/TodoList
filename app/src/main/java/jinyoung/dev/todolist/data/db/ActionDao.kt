package jinyoung.dev.todolist.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import jinyoung.dev.todolist.data.db.entities.ActionItem

@Dao
interface ActionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item: ActionItem)

    @Delete
    suspend fun delete(item: ActionItem)

    @Query("SELECT * FROM action_items")
    fun getAllActionItems(): LiveData<List<ActionItem>>

}