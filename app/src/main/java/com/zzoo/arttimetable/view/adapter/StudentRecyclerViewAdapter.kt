package com.zzoo.arttimetable.view.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.zzoo.arttimetable.databinding.StudentItemBinding
import com.zzoo.arttimetable.model.Student

class StudentRecyclerViewAdapter :RecyclerView.Adapter<StudentRecyclerViewAdapter.ViewHolder>(){
    var items = ArrayList<Student>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = StudentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = ViewHolder(binding)
        return holder
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class ViewHolder(binding:StudentItemBinding):RecyclerView.ViewHolder(binding.root){
        val binding = binding
        fun bind(student: Student){
            binding.model = student
        }
    }

}