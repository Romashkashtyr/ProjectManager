package com.romashka.projectmanager.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.romashka.projectmanager.Domain.OngoingDomain
import com.romashka.projectmanager.R
import com.romashka.projectmanager.databinding.ViewholderOngoingBinding

class OngoingAdapter(private val items: List<OngoingDomain>): RecyclerView.Adapter<OngoingAdapter.ViewHolder>() {
    private lateinit var binding: ViewholderOngoingBinding



    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.titleTxt)
        val data: TextView = itemView.findViewById(R.id.dateTxt)
        val progressBarPercent: TextView = itemView.findViewById(R.id.percentTxt)
        val progressTxt: TextView = itemView.findViewById(R.id.progressTxt)
        val progressBar: ProgressBar = itemView.findViewById(R.id.progressBar)
        val pic: ImageView = itemView.findViewById(R.id.titleTxt)
        val layout: TextView = itemView.findViewById(R.id.layout)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.viewholder_ongoing,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}