package com.freshworks.colormyviews

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {

        val clickableViews : List<View> = listOf(tv_boxone,tv_boxtwo,tv_boxthree,tv_boxfour,tv_boxfive,layout_constraint,btn_red,btn_yellow,btn_green)

        for( i in clickableViews)
            i.setOnClickListener{
                makeColored(it)
            }
    }

    fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            R.id.tv_boxone -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tv_boxtwo -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            R.id.tv_boxthree -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.tv_boxfour -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.tv_boxfive -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.btn_green -> tv_boxthree.setBackgroundResource(R.color.my_green)
            R.id.btn_yellow -> tv_boxfour.setBackgroundResource(R.color.my_yellow)
            R.id.btn_red -> tv_boxfive.setBackgroundResource(R.color.my_red)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }


}
