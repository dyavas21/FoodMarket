package com.example.foodmarketbwa.ui.auth.signin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.foodmarketbwa.R
import com.example.foodmarketbwa.databinding.ActivityMainBinding
import com.example.foodmarketbwa.databinding.FragmentSigninBinding

class SigninFragment : Fragment(R.layout.fragment_signin){
    private lateinit var binding: FragmentSigninBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSigninBinding.bind(view)


//        findNavController().navigate(R.)
    }
}