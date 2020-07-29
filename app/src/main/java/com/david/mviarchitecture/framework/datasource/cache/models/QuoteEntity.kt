package com.david.mviarchitecture.framework.datasource.cache.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "quote_table")
class QuoteEntity (

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    var id: Int,

    @ColumnInfo(name = "author")
    var author: String,

    @ColumnInfo(name = "quote")
    var quote: String,

    @ColumnInfo(name = "series")
    var series: String

)