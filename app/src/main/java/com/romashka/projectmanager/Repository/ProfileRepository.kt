package com.romashka.projectmanager.Repository

import com.romashka.projectmanager.Domain.TeamDomain

class ProfileRepository {

    val myTeamItems: MutableList<TeamDomain> = mutableListOf(
        TeamDomain("Food App Application", "Project In Progress"),
        TeamDomain("AI Python", "Completed"),
        TeamDomain("Weather App Backend", "Project In Progress"),
        TeamDomain("Kotlin developers", "Completed")
    )

    val archiveItems: MutableList<String> = mutableListOf(
        "UI/UX ScreenShot",
        "Kotlin Source Code",
        "Source Codes"
    )
}