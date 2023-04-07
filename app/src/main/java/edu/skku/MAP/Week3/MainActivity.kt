package edu.skku.MAP.Week3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var counter = 0
        val textview = findViewById<TextView>(R.id.textView)
        val imageview = findViewById<ImageView>(R.id.imageView)
        val left_btn = findViewById<Button>(R.id.button)
        val right_btn = findViewById<Button>(R.id.button2)


        textview.text = "pizza"
        imageview.setImageResource(R.drawable.pizza)
        Toast.makeText(this@MainActivity, "First Image", Toast.LENGTH_LONG).show()

        right_btn.setOnClickListener {
            counter += 1
            when (counter) {
                1 -> {
                    textview.text = "chicken"
                    imageview.setImageResource(R.drawable.chicken)
                }
                2 -> {
                    textview.text = "hamburger"
                    imageview.setImageResource(R.drawable.hamburger)
                }
                3 -> {
                    textview.text = "ramen"
                    imageview.setImageResource(R.drawable.ramen)
                }
                else -> {
                    counter -= 1
                    Toast.makeText(this@MainActivity, "Last Image", Toast.LENGTH_LONG).show()
                }
            }
        }

        left_btn.setOnClickListener {
            counter -= 1
            when (counter) {
                0 -> {
                    textview.text = "pizza"
                    imageview.setImageResource(R.drawable.pizza)
                }
                1 -> {
                    textview.text = "chicken"
                    imageview.setImageResource(R.drawable.chicken)
                }
                2 -> {
                    textview.text = "hamburger"
                    imageview.setImageResource(R.drawable.hamburger)
                }
                else -> {
                    counter += 1
                    Toast.makeText(this@MainActivity, "First Image", Toast.LENGTH_LONG).show()
                }
            }
        }



    }
}