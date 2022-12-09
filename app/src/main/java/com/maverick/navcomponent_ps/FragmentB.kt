package com.maverick.navcomponent_ps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.maverick.navcomponent_ps.databinding.FragmentBBinding

class FragmentB : Fragment() {

    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentBBinding.inflate(inflater, container, false)
        val view = binding.root

        val navController = activity?.let { Navigation.findNavController(it,R.id.fragmentContainerView) }
        binding.btnB.setOnClickListener {
            navController?.navigate(R.id.action_fragmentB_to_fragmentA)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}