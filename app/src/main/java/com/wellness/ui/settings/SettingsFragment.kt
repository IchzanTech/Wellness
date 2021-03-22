package com.wellness.ui.settings

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wellness.R
import com.wellness.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View {
        _binding = FragmentSettingsBinding.inflate(inflater, container, false)

        binding.cardLanguageSettings.setOnClickListener(this)

        return binding.root
    }

    override fun onClick(v: View?) {
        if (v == binding.cardLanguageSettings) {
            val mIntent = Intent(Settings.ACTION_LOCALE_SETTINGS)
            startActivity(mIntent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}