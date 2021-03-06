package com.example.exercise_roomdb.viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.exercise_roomdb.R
import com.example.exercise_roomdb.room.artist.Artist
import kotlinx.android.synthetic.main.artist_item_layout.view.*

class ArtistRecycleViewAdapter(private val artistList: List<Artist>) : RecyclerView.Adapter<ArtistViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.artist_item_layout, parent, false)
        return ArtistViewHolder(view)
    }

    override fun getItemCount(): Int {
        return artistList.size
    }

    override fun onBindViewHolder(holder: ArtistViewHolder, position: Int) {
        holder.artisNameText.text = artistList[position].name
        holder.debutText.text = artistList[position].debut
    }
}

class ArtistViewHolder(v: View): RecyclerView.ViewHolder(v){

    val artisNameText: TextView = v.findViewById<TextView>(R.id.artistNameInputText)
    val debutText: TextView = v.findViewById<TextView>(R.id.debutInputText)
}