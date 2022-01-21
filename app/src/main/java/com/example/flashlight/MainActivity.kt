package com.example.flashlight

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    private var isOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clBackground = findViewById<ConstraintLayout>(R.id.clBackground)

        clBackground.setBackgroundColor(Color.BLACK)

        clBackground.setOnClickListener {
            if (isOn) {
                clBackground.setBackgroundColor(Color.BLACK)
            } else {
                clBackground.setBackgroundColor(Color.WHITE)
            }
            isOn = !isOn
        }
    }
}