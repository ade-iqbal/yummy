package com.yummy.dicoding.myapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imageShop: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvAddress: TextView
    private lateinit var tvRating: TextView
    private lateinit var tvTelphone: TextView
    private lateinit var tvWebsite: TextView
    private lateinit var tvDescription: TextView
    private lateinit var telPhone: String
    private lateinit var website: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Detail"

        imageShop = findViewById(R.id.img_shop_detail)
        tvName = findViewById(R.id.tv_name_shop_detail)
        tvAddress = findViewById(R.id.tv_address_shop_detail)
        tvRating = findViewById(R.id.tv_rating_shop_detail)
        tvTelphone = findViewById(R.id.tv_telphone_shop_detail)
        tvWebsite = findViewById(R.id.tv_website_shop_detail)
        tvDescription = findViewById(R.id.tv_description_shop_detail)

        val image = intent.getStringExtra(Config.EXTRA_IMAGE)
        val name = intent.getStringExtra(Config.EXTRA_NAME)
        val address = intent.getStringExtra(Config.EXTRA_ADDRESS)
        val rating = intent.getDoubleExtra(Config.EXTRA_RATING, 0.0)
        telPhone = intent.getStringExtra(Config.EXTRA_TELPHONE).toString()
        website = intent.getStringExtra(Config.EXTRA_WEBSITE).toString()
        val description = intent.getStringExtra(Config.EXTRA_DESCRIPTION)

        Glide.with(this)
            .load(Uri.parse(image))
            .into(imageShop)
        tvName.text = name
        tvAddress.text = address
        tvRating.text = rating.toString()
        tvTelphone.text = if(telPhone != "null") telPhone else "-"
        tvWebsite.text = if(website != "null") website else "-"
        tvDescription.text = description

        if(telPhone != "null"){
            tvTelphone.setOnClickListener(this)
        }

        if(website != "null"){
            tvWebsite.setOnClickListener(this)
        }
    }

    override fun onClick(view: View) {
        when(view?.id){
            R.id.tv_telphone_shop_detail->{
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$telPhone"))
                startActivity(dialPhoneIntent)
            }

            R.id.tv_website_shop_detail->{
                val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse(website))
                tvWebsite.setTextColor(ContextCompat.getColor(this, R.color.blue))
                startActivity(webIntent)
            }
        }
    }


}