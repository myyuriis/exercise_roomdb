package com.example.exercise_roomdb.room.artist

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.exercise_roomdb.room.artist.Artist

@Dao
interface ArtistDao {
    @Insert
    fun createArtist(artist: Artist)

    @Query(value = "SELECT * FROM artist")
    fun getAllArtist(): LiveData<List<Artist>>

    @Query(value = "SELECT * FROM Artist WHERE id = :id")
    fun getArtistById(id: Int): Artist

    @Delete
    fun deleteArtist(artist: Artist)

    @Update
    fun updateArtist(artist: Artist)
}