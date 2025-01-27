package com.example.zypoddesignsystem

class DataRepository {

    fun getViewById(id : Int) : Int =
        when(id){
            1 -> R.layout.button_detail_layout
            2 -> R.layout.input_detail_layout
            3 -> R.layout.checkbox_detail_layout
            4 -> R.layout.toggle_detail_layout
            6 -> R.layout.dropdown_detail_layout
            7 -> R.layout.card_detail_layout
            11 -> R.layout.navigation_detail_layout
            12 -> R.layout.toolbar_detail_layout
            13 -> R.layout.menu_detail_layout
            14 -> R.layout.notification_detail_layout
            15 -> R.layout.error_message_detail_layout
            else -> R.layout.activity_detail
        }

}