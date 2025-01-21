package com.example.zypoddesignsystem

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zypoddesignsystem.databinding.ComponentItemBinding

class ComponentsAdapter(private val width : Int , private val data : List<ComponentModel>, val onClick :(Int) -> Unit) : RecyclerView.Adapter<ComponentsAdapter.RVAdapterViewHolder>() {

    inner class RVAdapterViewHolder(private val binding : ComponentItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(item : ComponentModel) = with(binding) {

            txtName.text = item.name
            imgCover.setImageResource(item.image)
            itemView.setOnClickListener {
                onClick(item.id)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapterViewHolder {
        val binding = ComponentItemBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return RVAdapterViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: RVAdapterViewHolder, position: Int) {
        holder.bind(data[position])
    }


}