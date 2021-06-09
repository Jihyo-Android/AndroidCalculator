package com.jhkim.androidcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // new -> old (new + old)
        var new = ""
        var old = ""

        // numpad Input
        one.setOnClickListener {
            new = new + "1"
            result.setText(new)
        }
        two.setOnClickListener {
            new = new + "2"
            result.setText(new)
        }
        three.setOnClickListener {
            new = new + "3"
            result.setText(new)
        }
        four.setOnClickListener {
            new = new + "4"
            result.setText(new)
        }
        five.setOnClickListener {
            new = new + "5"
            result.setText(new)
        }
        six.setOnClickListener {
            new = new + "6"
            result.setText(new)
        }
        seven.setOnClickListener {
            new = new + "7"
            result.setText(new)
        }
        eight.setOnClickListener {
            new = new + "8"
            result.setText(new)
        }
        nine.setOnClickListener {
            new = new + "9"
            result.setText(new)
        }
        zero.setOnClickListener {
            new = new + "0"
            result.setText(new)
        }
        dot.setOnClickListener {
            new = new + "."
            result.setText(new)
        }

        // Operations
        clear.setOnClickListener {
            new = ""
            old = ""
            result.setText("")
        }

        equals.setOnClickListener {
            result.setText(new)
        }

        plus.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
        }

        minus.setOnClickListener {
            old = (old.toInt() - new.toInt()).toString()
            new = "0"
        }

        multiply.setOnClickListener {
            old = (old.toInt() * new.toInt()).toString()
            new = "0"
        }

        // improvement required
        division.setOnClickListener {
            old = (old.toInt() * new.toInt()).toString()
            new = "0"
            result.setText(old)
        }


    }
}