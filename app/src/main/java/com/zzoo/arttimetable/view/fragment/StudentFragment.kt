package com.zzoo.arttimetable.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil

import com.zzoo.arttimetable.R
import com.zzoo.arttimetable.databinding.FragmentStudentBinding
import com.zzoo.arttimetable.viewmodel.StudentViewModel

class StudentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentStudentBinding>(inflater, R.layout.fragment_student,container,false)
        val viewModel = StudentViewModel()
        binding.model = viewModel

        return binding.root
    }
}