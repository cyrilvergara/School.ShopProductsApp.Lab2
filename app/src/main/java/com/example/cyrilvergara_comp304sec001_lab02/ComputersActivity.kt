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

class ComputersActivity : AppCompatActivity() {
    private val sharedPreferenceFile = "kotlinsharedpreference"

    private var ccheckBox: CheckBox? = null
    private var ccheckBox2: CheckBox? = null
    private var ccheckBox3: CheckBox? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computers)

        ccheckBox = findViewById<CheckBox>(R.id.ccheckBox)
        ccheckBox2 = findViewById<CheckBox>(R.id.ccheckBox2)
        ccheckBox3 = findViewById<CheckBox>(R.id.ccheckBox3)
        val checkoutBtn = findViewById<Button>(R.id.check_Out_Btn)


        val actionBar: android.app.ActionBar? = getActionBar()
        if (actionBar != null) {

            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setDisplayShowHomeEnabled(true)
            actionBar.show()
        }

        var title = "Computers"

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
        val ccheckBoxState = ccheckBox!!.isChecked
        val ccheckBox2State = ccheckBox2!!.isChecked
        val ccheckBox3State = ccheckBox3!!.isChecked

        preferenceEditor.putBoolean("ccheckBoxState", ccheckBoxState)
        preferenceEditor.putString("ccheckBoxName", ccheckBox!!.text as String?)
        preferenceEditor.putBoolean("ccheckBox2State", ccheckBox2State)
        preferenceEditor.putString("ccheckBox2Name", ccheckBox2!!.text as String?)
        preferenceEditor.putBoolean("ccheckBox3State", ccheckBox3State)
        preferenceEditor.putString("ccheckBox3Name", ccheckBox3!!.text as String?)

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