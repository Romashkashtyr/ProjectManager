package com.romashka.projectmanager.ViewModel

import androidx.lifecycle.ViewModel
import com.romashka.projectmanager.Repository.ProfileRepository

class ProfileViewModel(val repository: ProfileRepository): ViewModel() {
    constructor():this(ProfileRepository())

    fun loadDataMyTeam() = repository.myTeamItems
    fun loadDataArchive() = repository.archiveItems
}