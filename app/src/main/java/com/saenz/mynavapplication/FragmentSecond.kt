package com.saenz.mynavapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.saenz.mynavapplication.databinding.FragmentFirstBinding
import com.saenz.mynavapplication.databinding.FragmentSecondBinding

/**
 * A simple [Fragment] subclass.
 */
class FragmentSecond : Fragment() {

    //var choise = Choose{"option",0}


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = DataBindingUtil.inflate<FragmentSecondBinding>(inflater, R.layout.fragment_second, container, false)

        binding.btNext.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_fragmentSecond_to_fragmentThird)
        }

        return binding.root
    }

}
