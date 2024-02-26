package com.example.cyrilvergara_comp304sec001_lab02

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class CheckOutActivity : AppCompatActivity() {
    private val sharedPreferenceFile = "kotlinsharedpreference"
    @SuppressLint("ResourceType", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)

        val sharedPreferences: SharedPreferences = this.getSharedPreferences(sharedPreferenceFile, Context.MODE_PRIVATE)

        clearSharedPreferences()
        val selectHouse = findViewById<View>(R.id.selectProduct) as TextView
        selectHouse.visibility = View.INVISIBLE
        val nextBtn = findViewById<Button>(R.id.nextBtn)

        val titleTextView = findViewById<TextView>(R.id.tV)

        val myPreference = getSharedPreferences("info", MODE_PRIVATE)
        val checkBoxState = myPreference.getBoolean("checkBoxState", false)
        val checkBoxName = myPreference.getString("checkBoxName", "")
        val checkBox2State = myPreference.getBoolean("checkBox2State", false)
        val checkBox2Name = myPreference.getString("checkBox2Name", "")
        val checkBox3State = myPreference.getBoolean("checkBox3State", false)
        val checkBox3Name = myPreference.getString("checkBox3Name", "")

        val tcheckBoxState = myPreference.getBoolean("tcheckBoxState", false)
        val tcheckBoxName = myPreference.getString("tcheckBoxName", "")
        val tcheckBox2State = myPreference.getBoolean("tcheckBox2State", false)
        val tcheckBox2Name = myPreference.getString("tcheckBox2Name", "")
        val tcheckBox3State = myPreference.getBoolean("tcheckBox3State", false)
        val tcheckBox3Name = myPreference.getString("tcheckBox3Name", "")

        val ccheckBoxState = myPreference.getBoolean("ccheckBoxState", false)
        val ccheckBoxName = myPreference.getString("ccheckBoxName", "")
        val ccheckBox2State = myPreference.getBoolean("ccheckBox2State", false)
        val ccheckBox2Name = myPreference.getString("ccheckBox2Name", "")
        val ccheckBox3State = myPreference.getBoolean("ccheckBox3State", false)
        val ccheckBox3Name = myPreference.getString("ccheckBox3Name", "")

        val fcheckBoxState = myPreference.getBoolean("fcheckBoxState", false)
        val fcheckBoxName = myPreference.getString("fcheckBoxName", "")
        val fcheckBox2State = myPreference.getBoolean("fcheckBox2State", false)
        val fcheckBox2Name = myPreference.getString("fcheckBox2Name", "")
        val fcheckBox3State = myPreference.getBoolean("fcheckBox3State", false)
        val fcheckBox3Name = myPreference.getString("fcheckBox3Name", "")

        val acheckBoxState = myPreference.getBoolean("acheckBoxState", false)
        val acheckBoxName = myPreference.getString("acheckBoxName", "")
        val acheckBox2State = myPreference.getBoolean("acheckBox2State", false)
        val acheckBox2Name = myPreference.getString("acheckBox2Name", "")
        val acheckBox3State = myPreference.getBoolean("acheckBox3State", false)
        val acheckBox3Name = myPreference.getString("acheckBox3Name", "")


        var options_exist = false // to check whether there are selected options at all
        val rg = findViewById<View>(R.id.radioGroupCombo) as RadioGroup

        //checking every checkbox and adding radio button if it's checked
        if (checkBoxState) {
            val rb1 = RadioButton(this)
            rb1.setText(checkBoxName)
            rb1.id = 1
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb1, params)
            options_exist = true
        }
        if (checkBox2State) {
            val rb2 = RadioButton(this)
            rb2.setText(checkBox2Name)
            rb2.id = 2
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb2, params)
            options_exist = true
        }

        if (checkBox3State) {
            val rb12 = RadioButton(this)
            rb12.setText(checkBox3Name)
            rb12.id = 12
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb12, params)
            options_exist = true
        }

        if (tcheckBoxState) {
            val rb1 = RadioButton(this)
            rb1.setText(tcheckBoxName)
            rb1.id = 1
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb1, params)
            options_exist = true
        }
        if (tcheckBox2State) {
            val rb2 = RadioButton(this)
            rb2.setText(tcheckBox2Name)
            rb2.id = 2
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb2, params)
            options_exist = true
        }

        if (tcheckBox3State) {
            val rb12 = RadioButton(this)
            rb12.setText(tcheckBox3Name)
            rb12.id = 12
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb12, params)
            options_exist = true
        }

        if (ccheckBoxState) {
            val rb1 = RadioButton(this)
            rb1.setText(ccheckBoxName)
            rb1.id = 1
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb1, params)
            options_exist = true
        }
        if (ccheckBox2State) {
            val rb2 = RadioButton(this)
            rb2.setText(ccheckBox2Name)
            rb2.id = 2
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb2, params)
            options_exist = true
        }

        if (ccheckBox3State) {
            val rb12 = RadioButton(this)
            rb12.setText(ccheckBox3Name)
            rb12.id = 12
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb12, params)
            options_exist = true
        }

        if (fcheckBoxState) {
            val rb1 = RadioButton(this)
            rb1.setText(fcheckBoxName)
            rb1.id = 1
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb1, params)
            options_exist = true
        }
        if (fcheckBox2State) {
            val rb2 = RadioButton(this)
            rb2.setText(fcheckBox2Name)
            rb2.id = 2
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb2, params)
            options_exist = true
        }

        if (fcheckBox3State) {
            val rb12 = RadioButton(this)
            rb12.setText(fcheckBox3Name)
            rb12.id = 12
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb12, params)
            options_exist = true
        }

        if (acheckBoxState) {
            val rb1 = RadioButton(this)
            rb1.setText(acheckBoxName)
            rb1.id = 1
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb1, params)
            options_exist = true
        }
        if (acheckBox2State) {
            val rb2 = RadioButton(this)
            rb2.setText(acheckBox2Name)
            rb2.id = 2
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb2, params)
            options_exist = true
        }

        if (acheckBox3State) {
            val rb12 = RadioButton(this)
            rb12.setText(acheckBox3Name)
            rb12.id = 12
            val params = RadioGroup.LayoutParams(
                RadioGroup.LayoutParams.WRAP_CONTENT,
                RadioGroup.LayoutParams.WRAP_CONTENT
            )
            rg.addView(rb12, params)
            options_exist = true
        }

        if (!options_exist) {
            nextBtn.visibility = View.INVISIBLE
            selectHouse.visibility = View.VISIBLE
        }

        nextBtn.setOnClickListener {
            if (options_exist==false){
                Toast.makeText(applicationContext,"Please select atleast one", Toast.LENGTH_SHORT).show()
            }else{
                intent = Intent(applicationContext,PaymentActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun clearSharedPreferences() {
        // Clear the shared preferences file
        val sharedPref = getSharedPreferences(sharedPreferenceFile, Context.MODE_PRIVATE)
        sharedPref.edit().clear().apply()
    }
}