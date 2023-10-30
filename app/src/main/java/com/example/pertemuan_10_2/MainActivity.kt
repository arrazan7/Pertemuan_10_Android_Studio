package com.example.pertemuan_10_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.pertemuan_10_2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    companion object{
        var EXTRA_USERNAME = "extra_username"
        var EXTRA_EMAIL = "extra_email"
        var EXTRA_PHONE = "extra_phone"
        var EXTRA_PASSWORD = "extra_password"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var name = intent.getStringExtra("PASSING_USERNAME")
        var email = intent.getStringExtra("PASSING_EMAIL")
        var phone = intent.getStringExtra("PASSING_PHONE")
        var password = intent.getStringExtra("PASSING_PASSWORD")

        EXTRA_USERNAME = name.toString()
        EXTRA_EMAIL = email.toString()
        EXTRA_PHONE = phone.toString()

        replaceFragment(HomeFragment())

        with(binding){
            bottomNavView.setOnItemSelectedListener {
                when(it.itemId) {
                    R.id.nav_home -> replaceFragment(HomeFragment())
                    R.id.nav_prof -> replaceFragment(ProfileFragment())

                    else -> {}
                }
                true
            }
        }
    }

    private fun replaceFragment(fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        var fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}