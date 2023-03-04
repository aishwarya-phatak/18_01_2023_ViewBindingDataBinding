package com.example.a18_01_2023_viewbindinganddatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.a18_01_2023_viewbindinganddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    lateinit var password : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgView.setImageResource(R.drawable.ic_launcher_background)
        binding.txtUsername.text = "Aishwarya.Phatak@bitcode.in"
        //password = binding.edtPassword.text.toString()
        binding.btnSave.setOnClickListener{
            var user = User(1,
            "Gauri",
            "gauri@gmail.com")
            //Log.e("tag","View -- $it")
            //binding.txtUsername.setText(binding.edtPassword.text.toString())
            var intent = Intent(this,UserDetailsActivity::class.java)
            intent.putExtra("user",user)
            startActivity(intent)
        }
    }
}