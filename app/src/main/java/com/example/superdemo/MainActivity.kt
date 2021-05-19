package com.example.superdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerviewMain.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            productAdapter = ProductAdapter()
            adapter = productAdapter
            addItemDecoration(
                DividerItemDecoration(
                    this@MainActivity,
                    DividerItemDecoration.VERTICAL
                )
            )
        }

        addDataSet()
    }

    private fun addDataSet() {
        val data = DataSource.createDataSet()
        productAdapter.submitList(data)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.ic_help -> {
                helpUser()
                true
            }
            R.id.ic_search -> {
                performSearch()
                true
            }

            R.id.ic_add_product -> {
                addProduct()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun addProduct() {
        Toast.makeText(
            this,
            "Ooh sorry. The feature isn't available for now", Toast.LENGTH_SHORT
        )
            .show()
    }

    private fun performSearch() {
        Toast.makeText(
            this,
            "Ooh sorry. The feature isn't available for now", Toast.LENGTH_SHORT
        )
            .show()
    }

    private fun helpUser() {
        Toast.makeText(
            this,
            "Ooh sorry. The feature isn't available for now", Toast.LENGTH_SHORT
        )
            .show()
    }
}