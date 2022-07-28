package com.raywenderlich.colorboxes

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews : List<View> = listOf(box_one_text,box_two_text,
            box_three_text,box_four_text,box_five_text,constraint_layout,
            red_button,green_btn,yellow_btn)
        for (item in clickableViews){
            item.setOnClickListener {
                makeColoerd(it)
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun makeColoerd(view: View) {
        when (view.id){
            R.id.box_one_text -> view.setBackgroundResource(android.R.color.background_dark)
            R.id.box_two_text -> view.setBackgroundResource(android.R.color.holo_red_dark)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_dark)
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.red)
            R.id.yellow_btn -> box_four_text.setBackgroundResource(R.color.yellow)
            R.id.green_btn -> box_five_text.setBackgroundResource(R.color.green)
            else -> view.setBackgroundResource(android.R.color.holo_red_light)
        }
    }

}