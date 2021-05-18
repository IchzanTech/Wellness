package com.wellness.ui.home

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.wellness.R
import com.wellness.databinding.FragmentHomeBinding
import com.wellness.databinding.FragmentSettingsBinding
import com.wellness.wellfit.WellfitActivity

class HomeFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.wellfit.setOnClickListener(this)

        return binding.root
    }

    override fun onClick(v: View?) {
        if (v == binding.wellfit) {
            val mIntent = Intent(this@HomeFragment.activity, WellfitActivity::class.java)
            startActivity(mIntent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}