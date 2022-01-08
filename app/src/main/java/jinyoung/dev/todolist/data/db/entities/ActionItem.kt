package jinyoung.dev.todolist.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "action_items")
data class ActionItem(
    @ColumnInfo(name = "item_name")
    var name: String,
    @ColumnInfo(name = "item_amount")
    var amount: Int,

    @ColumnInfo(name = "item_staus")
var status: Boolean
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}