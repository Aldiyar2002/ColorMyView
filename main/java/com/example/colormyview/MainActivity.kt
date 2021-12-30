package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxTwoText2 = findViewById<TextView>(R.id.box_two_text2)
        val boxTwoText3 = findViewById<TextView>(R.id.box_two_text3)
        val boxTwoText4 = findViewById<TextView>(R.id.box_two_text4)
        val boxTwoText5 = findViewById<TextView>(R.id.box_two_text5)
        val boxTwoText6 = findViewById<TextView>(R.id.box_two_text6)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)



        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxTwoText2, boxTwoText3, boxTwoText4, boxTwoText5, boxTwoText6, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

    }
    private fun makeColored(view: View) {
        val three = findViewById<TextView>(R.id.box_three_text)
        val four = findViewById<TextView>(R.id.box_four_text)
        val five = findViewById<TextView>(R.id.box_five_text)
        when (view.id) {

            // Boxes using Color class colors for the background
            // R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.dice_1)
            // R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_two_text2 -> view.setBackgroundColor(Color.RED)
            R.id.box_two_text3 -> view.setBackgroundColor(Color.YELLOW)
            R.id.box_two_text4 -> view.setBackgroundColor(Color.BLACK)
            R.id.box_two_text5 -> view.setBackgroundColor(Color.GREEN)
            R.id.box_two_text6 -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.dice_2)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            //R.id.box_three_text -> view.setBackgroundResource(R.drawable.dice_3)
            //R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.dice_4)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            //R.id.box_five_text -> view.setBackgroundResource(R.drawable.dice_5)


            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
    //private fun setListeners() {

       // val boxOneText = findViewById<TextView>(R.id.box_one_text)
      //  val boxTwoText = findViewById<TextView>(R.id.box_two_text)
      //  val boxThreeText = findViewById<TextView>(R.id.box_three_text)
      //  val boxFourText = findViewById<TextView>(R.id.box_four_text)
      //  val boxFiveText = findViewById<TextView>(R.id.box_five_text)

      //  val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
      //  val clickableViews: List<View> =
       //     listOf(boxOneText, boxTwoText, boxThreeText,
       //         boxFourText, boxFiveText, rootConstraintLayout)
       // for (item in clickableViews) {
      //      item.setOnClickListener { makeColored(it) }
      //  }
    //}
}