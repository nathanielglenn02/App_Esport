package com.example.app_esport

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val title = findViewById<TextView>(R.id.detail_title)
        val description = findViewById<TextView>(R.id.detail_description)
        val date = findViewById<TextView>(R.id.detail_date)
        val location = findViewById<TextView>(R.id.detail_location)
        val prizePool = findViewById<TextView>(R.id.detail_prize_pool)
        val teams = findViewById<TextView>(R.id.detail_teams)
        val players = findViewById<TextView>(R.id.detail_players)
        val sponsors = findViewById<TextView>(R.id.detail_sponsors)
        val streamingPlatforms = findViewById<TextView>(R.id.detail_streaming_platforms)
        val website = findViewById<TextView>(R.id.detail_website)
        val socialMedia = findViewById<TextView>(R.id.detail_social_media)
        val schedule = findViewById<TextView>(R.id.detail_schedule)
        val history = findViewById<TextView>(R.id.detail_history)
        val image = findViewById<ImageView>(R.id.detail_image)


        val esportTitle = intent.getStringExtra("title")
        val esportDescription = intent.getStringExtra("description")
        val esportDate = intent.getStringExtra("date")
        val esportLocation = intent.getStringExtra("location")
        val esportPrizePool = intent.getStringExtra("prizePool")
        val esportTeams = intent.getStringArrayExtra("teams")?.joinToString(", ")
        val esportPlayers = intent.getStringArrayExtra("players")?.joinToString(", ")
        val esportSponsors = intent.getStringArrayExtra("sponsors")?.joinToString(", ")
        val esportStreamingPlatforms = intent.getStringExtra("streamingPlatforms")
        val esportWebsite = intent.getStringExtra("website")
        val esportSocialMedia = intent.getStringExtra("socialMedia")
        val esportSchedule = intent.getStringExtra("schedule")
        val esportHistory = intent.getStringExtra("history")
        val esportImage = intent.getIntExtra("image", 0)


        title.text = esportTitle
        description.text = esportDescription
        date.text = esportDate
        location.text = esportLocation
        prizePool.text = esportPrizePool
        teams.text = esportTeams
        players.text = esportPlayers
        sponsors.text = esportSponsors
        streamingPlatforms.text = esportStreamingPlatforms
        website.text = esportWebsite
        socialMedia.text = esportSocialMedia
        schedule.text = esportSchedule
        history.text = esportHistory
        image.setImageResource(esportImage)

        val shareButton = findViewById<Button>(R.id.action_share)
        shareButton.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_TEXT, esportDescription)
            }
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
    }
}
