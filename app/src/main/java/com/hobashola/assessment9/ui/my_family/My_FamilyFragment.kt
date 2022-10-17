package com.hobashola.assessment9.ui.my_family

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hobashola.assessment9.databinding.FragmentMyFamilyBinding

class My_FamilyFragment : Fragment() {

    private var _binding: FragmentMyFamilyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myFamilyViewModel =
            ViewModelProvider(this).get(My_FamilyViewModel::class.java)

        _binding = FragmentMyFamilyBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMyFamily
        myFamilyViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}