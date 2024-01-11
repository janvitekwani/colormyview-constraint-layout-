package com.example.colourmyviews

import android.database.DatabaseUtils
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.colourmyviews.databinding.ActivityMain1Binding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMain1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main1)

           // we are making list like an array but list because it contains layout also
           val viewlist :List<View> = listOf(binding.boxOneText, binding.boxTwoText, binding.boxThreeText, binding.boxFourText,binding.boxFiveText, binding.constraintLayout)

        // now we are traversing the list and making things clickable
        for(item in viewlist)
        {
            item.setOnClickListener{
                makeitcolor(item)  // here we are passing the view
            }
        }


    }
    fun makeitcolor(view: View){   // here we are setting the view 
        when (view)
        {
            //box using color class for background color
            binding.boxOneText->view.setBackgroundColor(Color.DKGRAY)
            binding.boxTwoText->view.setBackgroundColor(Color.GRAY)

            //boxes using android color resources
            binding.boxThreeText->view.setBackgroundResource(android.R.color.holo_green_light)
            binding.boxFourText->view.setBackgroundResource(android.R.color.holo_green_dark)

            binding.boxFiveText->view.setBackgroundResource(android.R.color.holo_green_light)

            else-> view.setBackgroundColor(Color.LTGRAY)


        }
    }

}







/*  ******************************* CONSTRAINT LAYOUT ****************************************************************************
   google interview :
        they creators of constraints layout tells about what is new happening i.e motion layout
   Q.  what actually the problem which constraint layout id trying to solve?
   A.  it make it easy for the developer for the actual positioning of their object , they can play with and all flexible

   Q.  How does constraintlayout work in determining where to poisition and size objects?
   A. it is hybrid model often people thinks it is  a linear solver , in constraints layout is more about graphical experience

   Q. what is the constraint layout?
   A. A connection or alignment to another UI element, to the parent layout , or to an invisible guideline
       it is very good when we have multiple view in one layout

       baseline constraints ?
         algining the elements with the text can be a challege specially when the fonts are differently sized elements therefore android provides us with
          baseline constraints.
          in this we have added baseline constraints on the instruction to the user








 */