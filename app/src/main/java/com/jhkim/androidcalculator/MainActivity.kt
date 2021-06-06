package com.jhkim.androidcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result : Int = 0
        var temp : String = ""

        if (result == 0) {
            zero.setOnClickListener {
                result += 0
                equals.setText(result.toString())

            }

            one.setOnClickListener {
                result += 1
                equals.setText(result.toString())
            }

            two.setOnClickListener {
                result += 2
                equals.setText(result.toString())
            }

            three.setOnClickListener {
                result += 3
                equals.setText(result.toString())
            }

            four.setOnClickListener {
                result += 4
                equals.setText(result.toString())
            }

            five.setOnClickListener {
                result += 5
                equals.setText(result.toString())
            }

            six.setOnClickListener {
                result += 6
                equals.setText(result.toString())
            }

            seven.setOnClickListener {
                result += 7
                equals.setText(result.toString())
            }

            eight.setOnClickListener {
                result += 8
                equals.setText(result.toString())
            }

            nine.setOnClickListener {
                result += 9
                equals.setText(result.toString())
            }
        }

        clear.setOnClickListener {
            result = 0
            equals.setText(result.toString())
        }

        plus.setOnClickListener {

        }
    }
}