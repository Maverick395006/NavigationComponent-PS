package com.maverick.navcomponent_ps

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.maverick.navcomponent_ps.databinding.FragmentABinding

class FragmentA : Fragment() {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentABinding.inflate(inflater, container, false)
        val view = binding.root

        val navController =
            activity?.let { Navigation.findNavController(it, R.id.fragmentContainerView) }
        binding.btnA.setOnClickListener {
            /**
             * Way 1
             */
//            navController?.navigate(R.id.action_fragmentA_to_fragmentB)
            /**
             * Way 2
             */
            val action = FragmentADirections.actionFragmentAToFragmentB()
            navController?.navigate(action)
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}