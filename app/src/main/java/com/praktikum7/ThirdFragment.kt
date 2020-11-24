package com.praktikum7

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import com.praktikum7.CommunicationViewModel


class ThirdFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var communicationViewModel: CommunicationViewModel? = null
    private var txtName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // mengatur communicationViewModel
        communicationViewModel = ViewModelProviders.
        of(requireActivity()).   get(CommunicationViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?     ): View? {
        // melakukan inflate pada layout fragment third
        return inflater.inflate(R.layout.fragment_third,
            container, false)     }
    companion object {

        fun newInstance(): ThirdFragment{
            return ThirdFragment()         }
    }
}