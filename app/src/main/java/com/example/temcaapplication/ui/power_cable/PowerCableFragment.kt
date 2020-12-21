package com.example.temcaapplication.ui.power_cable

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import com.example.temcaapplication.R

class PowerCableFragment : Fragment() {

    private lateinit var powerCableViewModel: PowerCableViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        powerCableViewModel =
                ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(PowerCableViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_power_cable, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        powerCableViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}