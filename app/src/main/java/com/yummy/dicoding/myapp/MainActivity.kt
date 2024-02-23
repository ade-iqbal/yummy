package com.yummy.dicoding.myapp

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.yummy.dicoding.myapp.adapter.ListShopAdapter
import com.yummy.dicoding.myapp.data.ShopData
import com.yummy.dicoding.myapp.model.Shop

class MainActivity : AppCompatActivity() {
    private lateinit var rvShop: RecyclerView
    private var list: ArrayList<Shop> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(!checkForInternet(this)){
            Toast.makeText(this, "Internet tidak aktif", Toast.LENGTH_SHORT).show()
        }

        rvShop = findViewById(R.id.rv_shop)
        rvShop.setHasFixedSize(true)

        list.addAll(ShopData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        supportActionBar?.title = "List Coffee & Resto"
        rvShop.layoutManager = LinearLayoutManager(this)
        val listShopAdapter = ListShopAdapter(list)
        rvShop.adapter = listShopAdapter

        listShopAdapter.setOnItemClickCallback(object : ListShopAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Shop) {
                val detailIntent = Intent(this@MainActivity, DetailActivity::class.java)
                detailIntent.putExtra(Config.EXTRA_IMAGE, data.image)
                detailIntent.putExtra(Config.EXTRA_NAME, data.name)
                detailIntent.putExtra(Config.EXTRA_ADDRESS, data.address)
                detailIntent.putExtra(Config.EXTRA_RATING, data.rating)
                detailIntent.putExtra(Config.EXTRA_TELPHONE, data.telphone)
                detailIntent.putExtra(Config.EXTRA_WEBSITE, data.website)
                detailIntent.putExtra(Config.EXTRA_DESCRIPTION, data.description)
                startActivity(detailIntent)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.about -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(aboutIntent)
            }
        }

        return super.onOptionsItemSelected(item)
    }

    private fun checkForInternet(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val network = connectivityManager.activeNetwork ?: return false

            val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false

            return when {
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true

                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true

                else -> false
            }
        } else {
            // if the android version is below M
            @Suppress("DEPRECATION") val networkInfo =
                connectivityManager.activeNetworkInfo ?: return false
            @Suppress("DEPRECATION")
            return networkInfo.isConnected
        }
    }
}