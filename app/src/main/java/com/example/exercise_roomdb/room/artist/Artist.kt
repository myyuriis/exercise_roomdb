package com.example.exercise_roomdb.room.artist

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Artist(@PrimaryKey @ColumnInfo var id: Int,
             @ColumnInfo(name = "name") var name: String,
             @ColumnInfo(name = "debut") var debut: String,
             @ColumnInfo(name = "origin_place") var originPlace: String) {}