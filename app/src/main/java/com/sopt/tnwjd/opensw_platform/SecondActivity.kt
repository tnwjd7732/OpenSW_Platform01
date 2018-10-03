package com.sopt.tnwjd.opensw_platform

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }


    private val TOTAL_COUNT = "total_count"

    fun showRandomNumber() {
        // Get the text view where the random number will be displayed
        val randomView = findViewById<View>(R.id.textview_random) as TextView

        // Get the text view where the heading is displayed
        val headingView = findViewById<View>(R.id.textview_label) as TextView

        // Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        // Generate the random number
        val random = Random()
        var randomInt = 0
        if (count > 0) {
            randomInt = random.nextInt(count)
        }

        // Display the random number.
        randomView.text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        headingView.text = getString(R.string.random_heading, count)
    }
}
