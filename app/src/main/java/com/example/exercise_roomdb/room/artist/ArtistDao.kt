package com.example.exercise_roomdb.room.artist

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.exercise_roomdb.room.artist.Artist

@Dao
interface ArtistDao {
    @Insert
    fun createArtist(artist: Artist)

    @Query(value = "SELECT * FROM artist")
    fun getAllArtist(): List<Artist>

    @Query(value = "SELECT * FROM Artist WHERE id = :id")
    fun getArtistById(id: Int): Artist
}