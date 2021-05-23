package com.example.superdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ProductComparisonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_comparison)

        //Change nav bar title
        val title = intent.getStringExtra(ProductCustomViewHolder.PRODUCT_TITLE)
        supportActionBar?.title = title
    }
}