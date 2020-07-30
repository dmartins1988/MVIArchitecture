package com.david.mviarchitecture.framework.datasource.cache.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.david.mviarchitecture.framework.datasource.cache.models.QuoteEntity

@Dao
interface QuoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertQuotes(quoteEntity: QuoteEntity) : Long

    @Query("SELECT * FROM quote_table")
    suspend fun getQuotes() : List<QuoteEntity>
}