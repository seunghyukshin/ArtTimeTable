package com.zzoo.arttimetable.utils

import androidx.databinding.BindingAdapter
import androidx.databinding.ObservableArrayList
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.zzoo.arttimetable.model.Student
import com.zzoo.arttimetable.view.adapter.StudentRecyclerViewAdapter

object DatabindingUtils {
    @BindingAdapter("bind_studentlist")
    @JvmStatic
    fun bindStudentList(recyclerView: RecyclerView, items: ObservableArrayList<Student>){
        if(recyclerView.adapter == null){
            val lm = LinearLayoutManager(recyclerView.context)
            val adapter = StudentRecyclerViewAdapter()
            recyclerView.layoutManager = lm
            recyclerView.adapter = adapter
        }
        (recyclerView.adapter as StudentRecyclerViewAdapter).items = items
        recyclerView.adapter?.notifyDataSetChanged()
    }


}