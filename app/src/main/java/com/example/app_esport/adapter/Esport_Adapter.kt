package com.example.app_esport.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.app_esport.DetailActivity
import com.example.app_esport.R
import com.example.app_esport.model.Esport

class Esport_Adapter(private val esportList: List<Esport>, private val context: Context) :
    RecyclerView.Adapter<Esport_Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val esport = esportList[position]
        holder.title.text = esport.title
        holder.overview.text = esport.overview
        holder.image.setImageResource(esport.imageResource)

        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra("title", esport.title)
            intent.putExtra("description", esport.description)
            intent.putExtra("date", esport.date)
            intent.putExtra("location", esport.location)
            intent.putExtra("prizePool", esport.prizePool)
            intent.putExtra("teams", esport.teams.toTypedArray())
            intent.putExtra("players", esport.players.toTypedArray())
            intent.putExtra("sponsors", esport.sponsors.toTypedArray())
            intent.putExtra("streamingPlatforms", esport.streamingPlatforms)
            intent.putExtra("website", esport.website)
            intent.putExtra("socialMedia", esport.socialMedia)
            intent.putExtra("schedule", esport.schedule)
            intent.putExtra("history", esport.history)
            intent.putExtra("image", esport.imageResource)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = esportList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.item_title)
        val overview: TextView = itemView.findViewById(R.id.item_overview)
        val image: ImageView = itemView.findViewById(R.id.item_image)
    }
}
