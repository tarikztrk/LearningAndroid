package com.example.odev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.odev.databinding.FragmentLandnarkListBinding

class LandnarkList : Fragment() {
    private var _binding: FragmentLandnarkListBinding? = null
    private val binding get() = _binding!!
    private lateinit var landmarkList : ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLandnarkListBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        landmarkList = ArrayList<Landmark>()

        val pisa = Landmark("Pisa","Italy",R.drawable.pisa)
        val pyramid = Landmark("Pyramid","Egypt",R.drawable.pyramid)
        val eiffel = Landmark("Eiffel","France",R.drawable.eiffel)
        val tacMahal = Landmark("Tac mahal","India",R.drawable.tacmahal)

        landmarkList.add(pisa)
        landmarkList.add(pyramid)
        landmarkList.add(eiffel)
        landmarkList.add(tacMahal)

        //RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = adapter




    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}