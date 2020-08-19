package com.example.exercise_roomdb.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.exercise_roomdb.room.artist.Artist
import com.example.exercise_roomdb.room.artist.ArtistDao

@Database(entities = arrayOf(Artist::class), version = 1, exportSchema = false)
public abstract class AppRoomDatabase : RoomDatabase() {

    abstract fun artistDao(): ArtistDao

    companion object {
        private var DATABASE_INSTANCE: AppRoomDatabase? = null

        fun getDatabaseInstance(context: Context): AppRoomDatabase {
            if (DATABASE_INSTANCE != null) {
                return DATABASE_INSTANCE as AppRoomDatabase
            }
            DATABASE_INSTANCE = Room
                .databaseBuilder(context.applicationContext
                    , AppRoomDatabase::class.java
                    , "spotify database").build()
            return DATABASE_INSTANCE as AppRoomDatabase
        }
    }
}