package com.example.xml

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val display = findViewById<TextView>(R.id.display_details)

        val userName = findViewById<EditText>(R.id.user_name)

        val emailId = findViewById<EditText>(R.id.email_id)

        val passWord = findViewById<EditText>(R.id.pass_word)

        val submit_btn = findViewById<Button>(R.id.submit_btn)

        submit_btn.setOnClickListener {

            val userValue = userName.text
            val email_id = emailId.text
            val pass_word = passWord.text

            if(userValue.length!=0 && email_id.length!=0 && pass_word.length!=0){

                val combinedtext: String = "$userValue with emailid:- $email_id and password:- $pass_word"

                display.text = combinedtext

                userName.setText("")
                emailId.setText("")
                passWord.setText("")
            }else{

                display.text = "Fill in all the Details"
            }





        }






    }
}