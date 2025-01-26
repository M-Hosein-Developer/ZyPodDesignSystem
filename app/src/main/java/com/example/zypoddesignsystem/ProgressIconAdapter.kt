package com.example.zypoddesignsystem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zypoddesignsystem.databinding.ProgressHorizontalItemBinding

class ProgressIconAdapter(private val data : List<String>, private val stepPosition: Int = 0) : RecyclerView.Adapter<ProgressIconAdapter.ProgressViewHolder>() {


    inner class ProgressViewHolder(private val binding : ProgressHorizontalItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(stepName: String, stepPosition: Int) {
            binding.txtStep.text = stepName
            binding.txtStepNumber.visibility = View.GONE

            if (layoutPosition == data.size - 1)
                binding.lineLeft.visibility = View.GONE

            if (layoutPosition <= stepPosition - 1)
                binding.imgStep.setImageResource(R.drawable.icon_step)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProgressViewHolder {
        val binding = ProgressHorizontalItemBinding.inflate(LayoutInflater.from(parent.context) , parent , false)
        return ProgressViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: ProgressViewHolder, position: Int) {
        holder.bind(data[position] , stepPosition)
    }

}