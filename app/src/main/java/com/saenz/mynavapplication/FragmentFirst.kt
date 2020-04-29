package com.saenz.mynavapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.saenz.mynavapplication.databinding.FragmentFirstBinding

/**
 * A simple [Fragment] subclass.
 */
class FragmentFirst : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding = DataBindingUtil.inflate<FragmentFirstBinding>(inflater, R.layout.fragment_first, container, false)

        binding.btEnviar.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_fragmentFirst_to_fragmentSecond2)
        }

        return binding.root
    }

}
