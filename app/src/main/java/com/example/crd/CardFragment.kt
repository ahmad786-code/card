package com.example.crd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CardFragment : Fragment() {
    companion object {
        private const val ARG_TEXT = "text"

        fun newInstance(text: String): CardFragment =
            CardFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_TEXT, text)
                }
            }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_card, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.textView).text = arguments?.getString(ARG_TEXT)
    }
}