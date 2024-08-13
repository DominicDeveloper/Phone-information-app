package com.asadbek.phoneinforatmationsapp

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.asadbek.phoneinforatmationsapp.databinding.ActivityMainBinding

/**
 * Owner: Dominic Azimov
 * Release date: 2024, 13th august
 * App: Phone information Telefon haqidagi ma`lumotlar
 */

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    // HardwareIds - Build.SERIAL deprektga tushgan shuning uchun SuppressLint ga qo`shilgan
    @SuppressLint("SetTextI18n", "HardwareIds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetInfo.setOnClickListener {
            binding.txSerial.text = "Serial: ${Build.SERIAL}"
            binding.txModel.text = "Model: ${Build.MODEL}"
            binding.txID.text = "Id: ${Build.ID}"
            binding.txManufacturer.text = "Manufacturer: ${Build.MANUFACTURER}"
            binding.txBrand.text = "Brand: ${Build.BRAND}"
            binding.txType.text = "Type: ${Build.TYPE}"
            binding.txUser.text = "User: ${Build.USER}"
            binding.txBase.text = "Base: ${Build.VERSION_CODES.BASE}"
            binding.txIncremental.text = "Incremental: ${Build.VERSION.INCREMENTAL}"
            binding.txSDK.text = "Sdk: ${Build.VERSION.SDK}"
            binding.txBoard.text = "Board: ${Build.BOARD}"
            binding.txHost.text = "Host: ${Build.HOST}"
            binding.txFingerprint.text = "Fingerprint: ${Build.FINGERPRINT}"
            binding.txVersionCode.text = "Version code: ${Build.VERSION.RELEASE}"
        }

    }
}