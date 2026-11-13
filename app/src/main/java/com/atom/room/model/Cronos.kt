package com.atom.room.model

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import androidx.room.Entity

@Entity (tableName = "cronos")
data class Cronos (
    @PrimaryKey(autoGenerate = true)
    val id: Long=0,
    @ColumnInfo(name="title")
    val title:String,
    @ColumnInfo(name="crono")
    val crono:String
)