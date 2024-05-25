package com.syazwan.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.syazwan.lab07.databinding.ActivityConfirmBinding
import com.syazwan.lab07.databinding.ActivityMainBinding

class ConfirmActivity : AppCompatActivity() {
    private lateinit var binding: ActivityConfirmBinding //MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()

        binding = ActivityConfirmBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nameTextView.text = intent.getStringExtra("name")
        binding.addressTextView.text = intent.getStringExtra("address")
        binding.cityTextView.text = intent.getStringExtra("city")
        binding.postcodeTextView.text = intent.getStringExtra("postcode")
        binding.stateTextView.text = intent.getStringExtra("state")
        binding.countryTextView.text = intent.getStringExtra("country")

        binding.confirmBtn.setOnClickListener {
            //open new page/finish page
            val intent = Intent(this,FinishActivity::class.java)
            startActivity(intent)
        }

        binding.cancelBtn.setOnClickListener {
            finish()//To close the current activity / or go back to previous page
        }

    }
}