package com.example.android_assignment_7.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.android_assignment_7.R

class DashboardFragments: Fragment(R.layout.dashboard_fragment) {

    private lateinit var textView: TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        textView = view.findViewById(R.id.textView)





    }

}