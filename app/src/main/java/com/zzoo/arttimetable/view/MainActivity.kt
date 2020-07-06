package com.zzoo.arttimetable.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.zzoo.arttimetable.R
import com.zzoo.arttimetable.view.fragment.StudentFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavigationUI.setupWithNavController(main_bottom_navigation, findNavController(R.id.nav_host))
//        supportFragmentManager.beginTransaction()
//                .replace(R.id.fragment, StudentFragment())
//                .commit()
    }
}