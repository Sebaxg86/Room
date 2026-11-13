package com.atom.room.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.atom.room.model.Cronos
import kotlinx.coroutines.flow.Flow

@Dao
interface CronosDatabaseDao{
    @Query(value = "SELECT * FROM cronos")
    fun getCronos(): Flow<List<Cronos>>

    @Query(value = "SELECT * FROM cronos WHERE id= :id")
    fun getCronosbyId(id:Long): Flow<Cronos>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(crono: Cronos)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(crono: Cronos)

    @Delete
    suspend fun delete(crono: Cronos)


    
}