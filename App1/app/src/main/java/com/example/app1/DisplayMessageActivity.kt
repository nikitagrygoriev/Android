package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        // Capture the layout's TextView and set the string as its text
        findViewById<TextView>(R.id.textView).apply { text = message }
        findViewById<TextView>(R.id.textView2).apply { text = message }
        findViewById<TextView>(R.id.textView3).apply { text = message }

    }
}
