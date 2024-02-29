package com.romashka.projectmanager.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.romashka.projectmanager.Adapter.ArchiveAdapter
import com.romashka.projectmanager.Adapter.MyTeamAdapter
import com.romashka.projectmanager.Domain.TeamDomain
import com.romashka.projectmanager.R
import com.romashka.projectmanager.ViewModel.ProfileViewModel
import com.romashka.projectmanager.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfileBinding
    val profileViewModel: ProfileViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            val myTeamAdapter by lazy { MyTeamAdapter(profileViewModel.loadDataMyTeam()) }
            viewTeam.apply {
                adapter = myTeamAdapter
                layoutManager = LinearLayoutManager(
                    this@ProfileActivity,
                    LinearLayoutManager.VERTICAL,
                    false
                )
            }

            val archiveAdapter by lazy { ArchiveAdapter(profileViewModel.loadDataArchive()) }
            viewArchive.apply {
                adapter = archiveAdapter
                layoutManager = LinearLayoutManager(
                    this@ProfileActivity,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            }

        }


    }


}