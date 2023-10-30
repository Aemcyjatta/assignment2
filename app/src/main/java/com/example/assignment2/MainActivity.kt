package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun allClearAction(view: View) {

    }
    fun backspaceAction(view: View) {}
    fun numberAction(view: View) {}
    fun operatorAction(view: View) {}
    fun equalsAction(view: View) {}
}