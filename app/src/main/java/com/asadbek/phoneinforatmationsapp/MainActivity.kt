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

        binding.btnGet.setOnClickListener {
            getAllData()
        }

    }
    @SuppressLint("SetTextI18n", "HardwareIds")
    private fun getAllData(){
        binding.tvSerial.text = "Seriasi: ${Build.SERIAL}" // seriya raqami
        binding.tvModel.text = "Modeli: ${Build.MODEL}" // telefon nomi
        binding.tvId.text = "Id: ${Build.ID}" // id raqami
        binding.tvManufacturer.text = "Nomi: ${Build.MANUFACTURER}" // telefon nomi
        binding.tvBrand.text = "Brend: ${Build.BRAND}" // telefon brend nomi
        binding.tvType.text = "Turi: ${Build.TYPE}" // foydalanish turi // odatda foydalanuvchi(user) bo`ladi
        binding.tvUser.text = "Foydalanuvchi: ${Build.USER}" // foydalanuvchi holati (builder)
        binding.tvVersionCodeBase.text = "Base versiya: ${Build.VERSION_CODES.BASE}" // dastur versiyasi
        binding.tvIncremental.text = "Incremental: ${Build.VERSION.INCREMENTAL}" // telefon proshivka versiyasi
        binding.tvSdk.text = "SDK: ${Build.VERSION.SDK}" // telefon sdksi
        binding.tvBoard.text = "Board: ${Build.BOARD}" // telefon versiyasining nomi 6.0 larda marshmallow bo`ladi
        binding.tvHost.text = "Hosti: ${Build.HOST}" // host nomi
        binding.tvFingerprint.text = "Barmoq izi skaneri: ${Build.FINGERPRINT}" // barmoq izi skaneri saqlanadigan joy yoki barmoq izi sknari majud bo`lgan joy
        binding.tvRelease.text = "Chiqarilgan versiya: ${Build.VERSION.RELEASE}" // telefon versiyasi
    }
}