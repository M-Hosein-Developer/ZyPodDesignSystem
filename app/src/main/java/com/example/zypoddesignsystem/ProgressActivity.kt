package com.example.zypoddesignsystem

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.window.OnBackInvokedDispatcher
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zypoddesignsystem.databinding.ProgressbarDetailLayoutBinding

class ProgressActivity : AppCompatActivity() {

    companion object{
        fun showActivity(context: Context){
            context.let {
                context.startActivity(Intent(context , ProgressActivity::class.java))
            }
        }
    }

    private lateinit var binding: ProgressbarDetailLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProgressbarDetailLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val stepName = listOf(
            "بارگذاری شناسنامه",
            "بررسی اطلاعات",
            "ایجاد حساب",
            "تایید و صدور",
            "اعتبار سنجی",
            "امضای قرار داد",
            "دریافت تسهیلات"
        )

        binding.rvHorizontalProgress.adapter = ProgressAdapter(stepName , 1)
        binding.rvHorizontalProgress.layoutManager = LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , true)

        binding.rvHorizontalIconProgress.adapter = ProgressIconAdapter(stepName , 2)
        binding.rvHorizontalIconProgress.layoutManager = LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , true)

        binding.rvHorizontalStepCounterProgress.adapter = ProgressStepCounterAdapter(stepName , 4)
        binding.rvHorizontalStepCounterProgress.layoutManager = LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , true)

    }

}