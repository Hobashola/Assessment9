package com.hobashola.assessment9.ui.my_friends

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hobashola.assessment9.databinding.FragmentMyFriendsBinding

class My_FriendsFragment : Fragment() {

    private var _binding: FragmentMyFriendsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myFriendsViewModel =
            ViewModelProvider(this).get(My_FriendsViewModel::class.java)

        _binding = FragmentMyFriendsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMyFriends
        myFriendsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}