package com.example.a18_01_2023_viewbindinganddatabinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a18_01_2023_viewbindinganddatabinding.databinding.UserDetailsActivityBinding

class UserDetailsActivity : AppCompatActivity() {
    lateinit var binding: UserDetailsActivityBinding
    lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = UserDetailsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent = intent
        user = intent.getSerializableExtra("user") as User
        binding.userObject = user

    }
}