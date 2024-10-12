package com.example.app_esport

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.app_esport.adapter.Esport_Adapter
import com.example.app_esport.model.Esport

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var esportAdapter: Esport_Adapter
    private lateinit var esportList: MutableList<Esport>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        esportList = mutableListOf(
            Esport(
                "Dota 2 International",
                "Turnamen terbesar Dota 2 di dunia.",
                "Dota 2 International adalah turnamen tahunan terbesar yang diselenggarakan oleh Valve, menampilkan tim terbaik dari seluruh dunia yang bersaing untuk mendapatkan hadiah terbesar dalam sejarah e-sports.",
                "15 Oktober 2023",
                "Seattle, USA",
                "$40,000,000",
                listOf("Team Secret", "OG", "PSG.LGD", "Evil Geniuses"),
                listOf("N0tail", "Puppey", "Arteezy", "Sumail"),
                listOf("NVIDIA", "Twitch", "Intel"),
                "Twitch, YouTube",
                "https://www.dota2.com/international",
                "@Dota2 on Twitter",
                "15 - 20 Oktober 2023",
                "Pemenang 2022: Team Spirit",
                R.drawable.dota2
            ),
            Esport(
                "League of Legends World Championship",
                "Kejuaraan dunia untuk game MOBA terkenal, League of Legends.",
                "League of Legends World Championship, juga dikenal sebagai Worlds, adalah puncak dari kompetisi tahunan di game League of Legends yang diikuti oleh tim-tim profesional dari seluruh dunia.",
                "30 November 2023",
                "Los Angeles, USA",
                "$2,225,000",
                listOf("T1", "Damwon Kia", "G2 Esports", "RNG"),
                listOf("Faker", "ShowMaker", "Perkz", "Uzi"),
                listOf("Mercedes-Benz", "Red Bull", "State Farm"),
                "Twitch, YouTube, lolesports.com",
                "https://lolesports.com",
                "@lolesports on Twitter",
                "30 Oktober - 6 November 2023",
                "Pemenang 2022: Edward Gaming",
                R.drawable.lol
            ),
            Esport(
                "CS:GO Major Championship",
                "Turnamen Major terbesar untuk game Counter-Strike: Global Offensive.",
                "CS:GO Major Championship adalah serangkaian turnamen yang disponsori oleh Valve dan diadakan secara internasional, mengumpulkan tim-tim terbaik untuk memperebutkan gelar juara dunia dalam game Counter-Strike: Global Offensive.",
                "20 Agustus 2023",
                "Berlin, Jerman",
                "$1,000,000",
                listOf("Natus Vincere", "FaZe Clan", "Astralis", "Virtus.pro"),
                listOf("s1mple", "karrigan", "device", "Jame"),
                listOf("Intel", "Betway", "BLAST Premier"),
                "Twitch, YouTube",
                "https://www.csgo.com/majors",
                "@CSGO on Twitter",
                "20 Agustus 2023",
                "Pemenang 2022: FaZe Clan",
                R.drawable.csgo
            ),
            Esport(
                "Fortnite World Cup",
                "Kompetisi terbesar untuk para pemain Fortnite.",
                "Fortnite World Cup adalah turnamen global untuk game Fortnite yang menampilkan pemain solo dan duo terbaik di dunia, dengan hadiah yang mencapai jutaan dolar.",
                "10 Juli 2023",
                "New York, USA",
                "$30,000,000",
                listOf("Bugha", "Aqua", "Nyhrox", "Tfue"),
                listOf("Bugha", "Aqua", "Tfue", "Ninja"),
                listOf("Samsung", "Coca-Cola"),
                "Twitch, YouTube",
                "https://www.epicgames.com/fortnite/en-US/competitive/world-cup",
                "@FortniteGame on Twitter",
                "10 Juli 2023",
                "Pemenang 2019: Bugha (Solo)",
                R.drawable.fortnite
            ),
            Esport(
                "Overwatch League",
                "Liga profesional untuk game Overwatch.",
                "Overwatch League adalah kompetisi e-sports untuk game Overwatch yang menampilkan format liga profesional dengan tim-tim yang berasal dari berbagai kota di dunia.",
                "12 September 2023",
                "San Francisco, USA",
                "$5,000,000",
                listOf("San Francisco Shock", "Dallas Fuel", "Shanghai Dragons", "Seoul Dynasty"),
                listOf("Super", "Fleta", "Fearless", "Profit"),
                listOf("Coca-Cola", "Xfinity", "Cheez-It"),
                "YouTube Gaming",
                "https://overwatchleague.com",
                "@overwatchleague on Twitter",
                "12 September 2023",
                "Pemenang 2021: Shanghai Dragons",
                R.drawable.overwatch
            ),
            Esport(
                "PUBG Global Championship",
                "Kompetisi global untuk game PUBG.",
                "PUBG Global Championship adalah turnamen terbesar yang diadakan oleh PUBG Corporation untuk game PlayerUnknown's Battlegrounds, menampilkan pertempuran sengit di medan perang antara tim-tim terbaik.",
                "25 November 2023",
                "Seoul, Korea Selatan",
                "$3,500,000",
                listOf("Gen.G", "Natus Vincere", "Soniqs", "Virtus.pro"),
                listOf("Loki", "Kickstart", "Tiggleton", "Pio"),
                listOf("Intel", "Alienware", "Zowie"),
                "Twitch, YouTube",
                "https://na.battlegrounds.pubg.com",
                "@PUBGEsports on Twitter",
                "25 November 2023",
                "Pemenang 2021: NewHappy",
                R.drawable.pubg
            ),
            Esport(
                "Call of Duty League",
                "Liga resmi untuk game Call of Duty.",
                "Call of Duty League adalah liga profesional yang didirikan oleh Activision untuk game Call of Duty, menampilkan tim-tim profesional yang bersaing dalam kompetisi tingkat dunia.",
                "18 Agustus 2023",
                "London, Inggris",
                "$4,600,000",
                listOf("Atlanta FaZe", "OpTic Texas", "Los Angeles Thieves", "Toronto Ultra"),
                listOf("Simp", "Scump", "Shotzzy", "Envoy"),
                listOf("Mountain Dew", "Game Fuel", "Scuf Gaming"),
                "YouTube Gaming",
                "https://callofdutyleague.com",
                "@CODLeague on Twitter",
                "18 Agustus 2023",
                "Pemenang 2022: Atlanta FaZe",
                R.drawable.cod
            ),
            Esport(
                "Rainbow Six Siege Invitational",
                "Kejuaraan dunia untuk game Rainbow Six Siege.",
                "Rainbow Six Siege Invitational adalah kompetisi tahunan terbesar untuk Rainbow Six Siege yang diadakan oleh Ubisoft dan menampilkan tim terbaik dari berbagai negara.",
                "1 Maret 2023",
                "Montreal, Kanada",
                "$3,000,000",
                listOf("BDS Esport", "Team Liquid", "G2 Esports", "NiP (Ninjas in Pyjamas)"),
                listOf("Shaiiko", "Paluh", "Psycho", "Kantoraketti"),
                listOf("Corsair", "Predator Gaming", "Red Bull"),
                "Twitch, YouTube",
                "https://www.ubisoft.com/en-us/esports/rainbow-six/siege-invitational",
                "@Rainbow6Game on Twitter",
                "1 Maret 2023",
                "Pemenang 2022: TSM",
                R.drawable.rainbow
            ),
            Esport(
                "FIFA eWorld Cup",
                "Kompetisi global untuk para pemain FIFA.",
                "FIFA eWorld Cup adalah turnamen terbesar untuk para pemain FIFA, yang diadakan oleh FIFA dan EA Sports. Pemain terbaik dari seluruh dunia bersaing untuk menjadi juara dunia.",
                "5 Agustus 2023",
                "Paris, Prancis",
                "$500,000",
                listOf("Fnatic", "Complexity", "Team Liquid"),
                listOf("Msdossary", "Tekkz", "Nicolas99fc", "MoAuba"),
                listOf("Adidas", "Visa", "PlayStation"),
                "Twitch, YouTube",
                "https://www.fifa.com/fifaeworldcup/",
                "@FIFAe on Twitter",
                "5 Agustus 2023",
                "Pemenang 2019: Msdossary",
                R.drawable.fifa
            ),
            Esport(
                "Apex Legends Global Series",
                "Kompetisi global untuk game Apex Legends.",
                "Apex Legends Global Series adalah turnamen internasional yang mempertemukan pemain-pemain terbaik dari seluruh dunia dalam permainan battle royale yang cepat dan dinamis.",
                "15 Juni 2023",
                "Tokyo, Jepang",
                "$2,000,000",
                listOf("TSM", "Team Liquid", "NRG Esports", "Alliance"),
                listOf("ImperialHal", "Albralelie", "sweetdreams", "Yuki"),
                listOf("Monster Energy", "Lenovo Legion", "Logitech G"),
                "Twitch, YouTube",
                "https://www.ea.com/games/apex-legends/compete/overview",
                "@PlayApex on Twitter",
                "15 Juni 2023",
                "Pemenang 2022: Reignite",
                R.drawable.apex
            )
        )

        esportAdapter = Esport_Adapter(esportList, this)
        recyclerView.adapter = esportAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_about_page -> {
                startActivity(Intent(this, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
