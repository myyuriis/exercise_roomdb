package com.example.exercise_roomdb.room.artist

class ArtistRepository(private val artistDao: ArtistDao) {

    val allArtist: List<Artist> = artistDao.getAllArtist()

    fun createArtist(artist: Artist) {
        artistDao.createArtist(artist)
    }
}