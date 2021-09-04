package com.example.birthdaygreeting

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
 }

    fun createbirthdaycard (view: View) {
        val name = nameInput.editableText.toString()

        val intent=Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)
    }


}

