package com.example.cyrilvergara_comp304sec001_lab02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class TvActivity : AppCompatActivity() {
    private val sharedPreferenceFile = "kotlinsharedpreference"

    private var tcheckBox: CheckBox? = null
    private var tcheckBox2: CheckBox? = null
    private var tcheckBox3: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tv)

        tcheckBox = findViewById<CheckBox>(R.id.tcheckBox)
        tcheckBox2 = findViewById<CheckBox>(R.id.tcheckBox2)
        tcheckBox3 = findViewById<CheckBox>(R.id.tcheckBox3)
        val checkoutBtn = findViewById<Button>(R.id.check_Out_Btn)


        val actionBar: android.app.ActionBar? = getActionBar()
        if (actionBar != null) {

            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setDisplayShowHomeEnabled(true)
            actionBar.show()
        }

        var title = "Tv's"

        checkoutBtn.setOnClickListener {

            check(it);
            intent = Intent(applicationContext,CheckOutActivity::class.java)

            //intent.putExtra("selected",result)
            intent.putExtra("title",title)
            startActivity(intent)
        }
    }

    fun check(view: View?){
        val myPreference = getSharedPreferences("info", 0)
        //prepare it for edit by creating an Edit object
        val preferenceEditor = myPreference.edit()

        //checking and saving info from checkboxes
        val tcheckBoxState = tcheckBox!!.isChecked
        val tcheckBox2State = tcheckBox2!!.isChecked
        val tcheckBox3State = tcheckBox3!!.isChecked

        preferenceEditor.putBoolean("tcheckBoxState", tcheckBoxState)
        preferenceEditor.putString("tcheckBoxName", tcheckBox!!.text as String?)
        preferenceEditor.putBoolean("tcheckBox2State", tcheckBox2State)
        preferenceEditor.putString("tcheckBox2Name", tcheckBox2!!.text as String?)
        preferenceEditor.putBoolean("tcheckBox3State", tcheckBox3State)
        preferenceEditor.putString("tcheckBox3Name", tcheckBox3!!.text as String?)

        preferenceEditor.commit()
        Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_product_type,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.mAppliances -> {
                Toast.makeText(this,"Displaying Appliances", Toast.LENGTH_SHORT).show()
                check(view = null)
                intent = Intent(applicationContext,AppliancesActivity::class.java)
                startActivity(intent)
            }
            R.id.mTvs ->{
                Toast.makeText(this,"Displaying Tv's", Toast.LENGTH_SHORT).show()
                check(view = null)
                intent = Intent(applicationContext,TvActivity::class.java)
                startActivity(intent)
            }
            R.id.mComputers -> {
                Toast.makeText(this,"Displaying Computers", Toast.LENGTH_SHORT).show()
                check(view = null)
                intent = Intent(applicationContext,ComputersActivity::class.java)
                startActivity(intent)
            }
            R.id.mFurniture -> {
                Toast.makeText(this,"Displaying Furniture", Toast.LENGTH_SHORT).show()
                check(view = null)
                intent = Intent(applicationContext,FurnitureActivity::class.java)
                startActivity(intent)
            }
            R.id.mAutoAccessories -> {
                Toast.makeText(this,"Displaying Auto Accessories", Toast.LENGTH_SHORT).show()
                check(view = null)
                intent = Intent(applicationContext,AutoAccessoriesActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}