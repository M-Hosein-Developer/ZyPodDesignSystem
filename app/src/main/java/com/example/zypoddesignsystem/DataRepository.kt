package com.example.zypoddesignsystem

class DataRepository {

    fun getViewById(id : Int) : Int =
        when(id){
            1 -> R.layout.button_detail_layout
            2 -> R.layout.input_detail_layout
            3 -> R.layout.checkbox_detail_layout
            4 -> R.layout.activity_detail
            5 -> R.layout.activity_detail
            6 -> R.layout.activity_detail
            7 -> R.layout.activity_detail
            8 -> R.layout.activity_detail
            9 -> R.layout.activity_detail
            10 -> R.layout.activity_detail
            11 -> R.layout.activity_detail
            12 -> R.layout.activity_detail
            13 -> R.layout.activity_detail
            14 -> R.layout.activity_detail
            15 -> R.layout.activity_detail
            16 -> R.layout.activity_detail
            17 -> R.layout.activity_detail
            18 -> R.layout.activity_detail
            19 -> R.layout.activity_detail
            20 -> R.layout.activity_detail
            21 -> R.layout.activity_detail
            else -> R.layout.activity_detail
        }

}