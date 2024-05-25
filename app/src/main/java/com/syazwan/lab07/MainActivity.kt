package com.syazwan.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.syazwan.lab07.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //MainActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

       binding.scheduleBtn.setOnClickListener {
           val intent = Intent(this, ConfirmActivity::class.java)
           //yang kiri adalah fail name(key) yg kanan adalah data yang dihantar

           //menghantar data ke page baru


           intent.putExtra("name",binding.nameEditText.text.toString())
           intent.putExtra("address",binding.addressEditText.text.toString())
           intent.putExtra("city",binding.cityEditText.text.toString())
           intent.putExtra("state",binding.stateEditText.text.toString())
           intent.putExtra("postcode",binding.postcodeEditText.text.toString())
           intent.putExtra("country",binding.countryEditText.text.toString())

           startActivity(intent)
       }

    }
}