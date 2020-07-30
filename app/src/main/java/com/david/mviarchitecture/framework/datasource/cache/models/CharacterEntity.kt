package com.david.mviarchitecture.framework.datasource.cache.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "character_table")
class CharacterEntity(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "character_id")
    var id: Int?,

    @ColumnInfo(name = "name")
    var name: String?,

    @ColumnInfo(name = "nickname")
    var nickname: String?

)