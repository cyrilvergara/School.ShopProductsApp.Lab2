package com.example.cyrilvergara_comp304sec001_lab02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class ProductSelectActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_select)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_product_type,menu)
        return super.onCreateOptionsMenu(menu)
    }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.mAppliances -> {
                Toast.makeText(this,"Displaying Appliances", Toast.LENGTH_SHORT).show()
                intent = Intent(applicationContext,AppliancesActivity::class.java)
                startActivity(intent)
            }
            R.id.mTvs ->{
                Toast.makeText(this,"Displaying Tv's", Toast.LENGTH_SHORT).show()
                intent = Intent(applicationContext,TvActivity::class.java)
                startActivity(intent)
            }
            R.id.mComputers -> {
                Toast.makeText(this,"Displaying Computers", Toast.LENGTH_SHORT).show()
                intent = Intent(applicationContext,ComputersActivity::class.java)
                startActivity(intent)
            }
            R.id.mFurniture -> {
                Toast.makeText(this,"Displaying Furniture", Toast.LENGTH_SHORT).show()
                intent = Intent(applicationContext,FurnitureActivity::class.java)
                startActivity(intent)
            }
            R.id.mAutoAccessories -> {
                Toast.makeText(this,"Displaying Auto Accessories", Toast.LENGTH_SHORT).show()
                intent = Intent(applicationContext,AutoAccessoriesActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

}