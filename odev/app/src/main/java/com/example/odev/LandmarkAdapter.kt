package com.example.odev

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.odev.databinding.RecyclerRowBinding


class LandmarkAdapter(val landmarkList : List<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>() {

    class LandmarkHolder(val binding : RecyclerRowBinding): RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {

        holder.binding.recyclerRowTextView.text = landmarkList[position].name
        holder.itemView.setOnClickListener {
            val action = LandnarkListDirections.actionLandnarkListToLandmarkDetail2(landmarkList[position].name,landmarkList[position].country,landmarkList[position].image)
            Navigation.findNavController(it).navigate(action)

        }
    }
}
