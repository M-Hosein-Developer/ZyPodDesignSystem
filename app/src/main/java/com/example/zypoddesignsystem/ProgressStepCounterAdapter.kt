package com.example.zypoddesignsystem

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zypoddesignsystem.databinding.ProgressHorizontalItemBinding

class ProgressStepCounterAdapter(private val data : List<String>, private val stepPosition: Int = 0) : RecyclerView.Adapter<ProgressStepCounterAdapter.ProgressViewHolder>() {


    inner class ProgressViewHolder(private val binding : ProgressHorizontalItemBinding) : RecyclerView.ViewHolder(binding.root){

        @SuppressLint("SetTextI18n", "ResourceAsColor")
        fun bind(stepName: String, stepPosition: Int) {
            binding.txtStep.text = stepName
            binding.txtStepNumber.text = "${layoutPosition + 1}"

            if (layoutPosition == data.size - 1)
                binding.lineLeft.visibility = View.GONE

            if (layoutPosition <= stepPosition - 1) {
                binding.imgStep.setImageResource(R.drawable.step_circle)
                binding.txtStepNumber.setTextColor(Color.WHITE)
            }

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