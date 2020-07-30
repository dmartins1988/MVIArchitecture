package com.david.mviarchitecture.framework.datasource.cache.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.david.mviarchitecture.framework.datasource.cache.models.CharacterEntity

@Dao
interface CharacterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacter(characterEntity: CharacterEntity) : Long

    @Query("SELECT * FROM character_table")
    suspend fun getCharacters() : List<CharacterEntity>

}