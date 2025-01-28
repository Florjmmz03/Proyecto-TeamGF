package com.example.proyectoteamgf

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.proyectoteamgf.databinding.FragmentRegisterBinding
import com.example.proyectoteamgf.viewModel.SignUpViewModel

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val viewModel by viewModels<SignUpViewModel>()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        //findNavController().navigate(R.id.action_Second2Fragment_to_First2Fragment)
        binding.button.setOnClickListener {
            viewModel.createUser(binding.emailTextInput.text.toString(), "12345678")
        }

        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}