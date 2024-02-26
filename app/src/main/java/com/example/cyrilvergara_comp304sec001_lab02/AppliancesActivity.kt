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

class AppliancesActivity : AppCompatActivity() {
    private val sharedPreferenceFile = "kotlinsharedpreference"

    private var checkBox: CheckBox? = null
    private var checkBox2: CheckBox? = null
    private var checkBox3: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appliances)

        checkBox = findViewById<CheckBox>(R.id.checkBox)
        checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
        val checkoutBtn = findViewById<Button>(R.id.check_Out_Btn)


        val actionBar: android.app.ActionBar? = getActionBar()
        if (actionBar != null) {

            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setDisplayShowHomeEnabled(true)
            actionBar.show()
        }

        var title = "Appliances"

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
        val checkBoxState = checkBox!!.isChecked
        val checkBox2State = checkBox2!!.isChecked
        val checkBox3State = checkBox3!!.isChecked

        preferenceEditor.putBoolean("checkBoxState", checkBoxState)
        preferenceEditor.putString("checkBoxName", checkBox!!.text as String?)
        preferenceEditor.putBoolean("checkBox2State", checkBox2State)
        preferenceEditor.putString("checkBox2Name", checkBox2!!.text as String?)
        preferenceEditor.putBoolean("checkBox3State", checkBox3State)
        preferenceEditor.putString("checkBox3Name", checkBox3!!.text as String?)

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