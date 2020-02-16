package com.lukianbat.template.feature.auth.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.lukianbat.template.R
import org.koin.android.viewmodel.ext.android.viewModel

class AuthFragment : Fragment() {

    private val authViewModel: AuthViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        authViewModel
        return inflater.inflate(R.layout.auth_fragment, container, false)
    }
}
