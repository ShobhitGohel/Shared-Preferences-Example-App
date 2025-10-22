package com.shobhu.assignment4

import android.content.Context
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnLoad = findViewById<Button>(R.id.btnLoad)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        // get shared preference storage
        val sharedPref = getSharedPreferences("MyLocalStorage", Context.MODE_PRIVATE)

        btnSave.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()

            // store in shared preference
            val editor = sharedPref.edit()
            editor.putString("name", name)
            editor.putString("email", email)
            editor.apply()

            Toast.makeText(this, "Data Saved ✅", Toast.LENGTH_SHORT).show()
        }

        btnLoad.setOnClickListener {
            // retrieve data
            val name = sharedPref.getString("name", "No Name Found")
            val email = sharedPref.getString("email", "No Email Found")

            tvResult.text = "Name: $name\nEmail: $email"
        }
    }
}
