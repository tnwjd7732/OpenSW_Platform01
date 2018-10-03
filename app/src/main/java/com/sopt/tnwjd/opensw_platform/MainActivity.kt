package com.sopt.tnwjd.opensw_platform

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.TextView
import android.content.Intent
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view : View) {
        // Toast myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Hello Toast!",
                Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        // Get the text view.
        val showCountTextView = findViewById<View>(R.id.textView) as TextView

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it.
        var count: Int? = Integer.parseInt(countString)
        if (count != null) {
            count = count+1
        }

        // Display the new value in the text view.
        showCountTextView.text = count!!.toString()
    }

    private val TOTAL_COUNT = "total_count"

    fun randomMe(view: View) {

        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        // Get the text view that shows the count.
        val showCountTextView = findViewById<View>(R.id.textView) as TextView

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }



}

