package com.example.zypoddesignsystem

import android.os.Build
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.zypoddesignsystem.databinding.ActivityMainBinding

@Suppress("DEPRECATION")
@RequiresApi(Build.VERSION_CODES.O)
class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val component = listOf(
            ComponentModel(1 , "دکمه" , R.drawable.zypod),
            ComponentModel(2 , "ورودی ها" , R.drawable.zypod),
            ComponentModel(3 , "چک باکس" , R.drawable.zypod),
            ComponentModel(4 , "دکمه های toggle" , R.drawable.zypod),
            ComponentModel(6 , "dropdown" , R.drawable.zypod),
            ComponentModel(7 , "کارد" , R.drawable.zypod),
            ComponentModel(9 , "نوار پیشرفت" , R.drawable.zypod),
            ComponentModel(10 , "جدول" , R.drawable.zypod),
            ComponentModel(11 , "نوار ناوبری" , R.drawable.zypod),
            ComponentModel(12 , "نوار بالا" , R.drawable.zypod),
            ComponentModel(13 , "منو ها" , R.drawable.zypod),
            ComponentModel(14 , "اعلان ها" , R.drawable.zypod),
            ComponentModel(15 , "پیام های ارور" , R.drawable.zypod),
            ComponentModel(16 , "فضاها" , R.drawable.zypod),
            ComponentModel(17 , "شعاع گوشه" , R.drawable.zypod),
            ComponentModel(18 , "تقویم" , R.drawable.zypod),
            ComponentModel(19 , "نشان ها" , R.drawable.zypod),
            ComponentModel(20 , "پاپ آپ" , R.drawable.zypod),
            ComponentModel(21 , "سرچ بار" , R.drawable.zypod)
        )

        setupSettingButton()
        setupComponentRecyclerView(component)


    }

    private fun setupComponentRecyclerView(component: List<ComponentModel>) = with(binding) {
        val width = halfScreenSize()
        rvComponents.adapter = ComponentsAdapter(width , component){ id ->
            DetailActivity.showDetail(this@MainActivity , id)
        }
        rvComponents.layoutManager = GridLayoutManager(this@MainActivity , 2)
    }

    private fun setupSettingButton() = with(binding) {



    }

    fun halfScreenSize(): Int {
        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)

        val screenWidth = displayMetrics.widthPixels

        val halfScreenWidth = screenWidth / 2

        return halfScreenWidth
    }
}