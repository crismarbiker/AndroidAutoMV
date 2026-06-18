package com.andrerinas.headunitrevived.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.andrerinas.headunitrevived.R
import com.google.android.material.appbar.MaterialToolbar
import java.util.Calendar

class AboutFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val toolbar = view.findViewById<MaterialToolbar>(R.id.toolbar)
        toolbar.setNavigationOnClickListener {
            findNavController().popBackStack()
        }

        val copyrightText = view.findViewById<TextView>(R.id.copyright_text)
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        copyrightText.text = getString(R.string.copyright, currentYear)
    }
}
