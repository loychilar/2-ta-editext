package com.example.a2text

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.a2text.R

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var editText2: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.edt)
        editText2 = findViewById(R.id.txt1)


        editText.addTextChangedListener {
            val tempText = editText.text.toString()
            editText.setText(editText2.text.toString())
            editText2.setText(tempText)
        }

        editText2.addTextChangedListener {
            val tempText = editText2.text.toString()
            editText2.setText(editText2.text.toString())
            editText.setText(tempText)
        }

    }
}
