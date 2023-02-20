package com.example.odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.odev.databinding.FragmentLandmarkDetailBinding
import com.example.odev.databinding.FragmentLandnarkListBinding

class LandmarkDetail : Fragment() {

    private var _binding: FragmentLandmarkDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLandmarkDetailBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            binding.imageView.setImageResource(LandmarkDetailArgs.fromBundle(it).image)
            binding.countryText.text = LandmarkDetailArgs.fromBundle(it).country
            binding.nameText.text=LandmarkDetailArgs.fromBundle(it).name
        }
    }
}