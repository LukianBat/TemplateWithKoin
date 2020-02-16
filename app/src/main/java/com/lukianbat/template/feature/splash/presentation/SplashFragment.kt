package com.lukianbat.template.feature.splash.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.lukianbat.template.R
import com.lukianbat.template.core.utils.log
import org.koin.android.viewmodel.ext.android.viewModel

class SplashFragment : Fragment(), SplashContract.SplashView {

    private val splashViewModel: SplashViewModel by viewModel()

    override fun navigateToAuth() {
        findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToAuthFragment())
    }

    override fun navigateToMain() {
        log("MAIN")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        splashViewModel.eventsDispatcher.bind(this, this)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        splashViewModel.checkSettings()
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }
}
