package com.zzoo.arttimetable.viewmodel

import android.util.Log
import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField

import com.zzoo.arttimetable.model.Student

class StudentViewModel {
    // null 처리해주기
    val name = ObservableField<String>()
    val age = ObservableField<String>()
    val sex = ObservableField<String>()
    val studentList = ObservableArrayList<Student>()

    fun registerStudent(){
        addToList()
        clear()
    }

    private fun addToList(){
        studentList.add(Student(name.get().toString(),   age.get().toString().toInt(), sex.get().toString()))
    }
    private fun clear(){
        name.set("")
        age.set("")
        sex.set("")

    }
}