package com.example.superdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.superdemo.databinding.ActivityProductComparisonBinding
import com.squareup.picasso.Picasso

class ProductComparisonActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductComparisonBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductComparisonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Change nav bar title
        val title = intent.getStringExtra(ProductCustomViewHolder.PRODUCT_TITLE)
        supportActionBar?.title = title

        fillUpComparisonList()
    }

    private fun fillUpComparisonList() {
        val imageTarget = binding.productImage
        val image = intent.getStringExtra(ProductCustomViewHolder.PRODUCT_IMAGE)
        Picasso.get().load(image).into(imageTarget)

        val superOneName = intent.getStringExtra(ProductCustomViewHolder.SUPER_ONE)
        binding.textViewSupermarketOneName.text = superOneName

        val superOnePrice = intent.getStringExtra(ProductCustomViewHolder.SUPER_ONE_PRICE)
        binding.textViewSupermarketOnePrice.text = superOnePrice

        val superTwoName = intent.getStringExtra(ProductCustomViewHolder.SUPER_TWO)
        binding.textViewSupermarketTwoName.text = superTwoName

        val superTwoPrice = intent.getStringExtra(ProductCustomViewHolder.SUPER_TWO_PRICE)
        binding.textViewSupermarketTwoPrice.text = superTwoPrice
    }
}