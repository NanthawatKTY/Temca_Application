package com.example.temcaapplication.ui.conduit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import com.example.temcaapplication.R

class ConduitFragment : Fragment() {

    private lateinit var conduitViewModel: ConduitViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        conduitViewModel =
                ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(ConduitViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_conduit, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        conduitViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}