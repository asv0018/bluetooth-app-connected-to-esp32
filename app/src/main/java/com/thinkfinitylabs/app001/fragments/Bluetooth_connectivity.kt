package com.thinkfinitylabs.app001.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thinkfinitylabs.app001.R
import kotlinx.android.synthetic.main.fragment_bluetooth_connectivity.*


class Bluetooth_connectivity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bluetooth_connectivity, container, false)
    }


}