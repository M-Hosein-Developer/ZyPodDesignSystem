package com.example.zypoddesignsystem

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.zypoddesignsystem.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private var id : Int = 0

    companion object{
        fun showDetail(context: Context , id : Int){
            context.let {
                val intent = Intent(context , DetailActivity::class.java)
                intent.putExtra(DETAIL_ACTIVITY , id)
                context.startActivity(intent)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        handleIntent()

        setContentView(DataRepository().getViewById(id))
    }

    private fun handleIntent(){
        intent?.let {
            id = it.getIntExtra(DETAIL_ACTIVITY , 0)
        }
    }

}