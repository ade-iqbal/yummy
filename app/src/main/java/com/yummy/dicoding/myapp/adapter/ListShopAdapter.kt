package com.yummy.dicoding.myapp.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.yummy.dicoding.myapp.model.Shop
import com.yummy.dicoding.myapp.R

class ListShopAdapter(private val listShop: ArrayList<Shop>) : RecyclerView.Adapter<ListShopAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Shop)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imageShop: ImageView = itemView.findViewById(R.id.img_shop)
        var tvName: TextView = itemView.findViewById(R.id.tv_name_shop)
        var tvAddress: TextView = itemView.findViewById(R.id.tv_address_shop)
        var tvRating: TextView = itemView.findViewById(R.id.tv_rating_shop)
        var tvDistance: TextView = itemView.findViewById(R.id.tv_distance_shop)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_item_shop, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val shop = listShop[position]
        Glide.with(holder.itemView.context)
            .load(Uri.parse(shop.image))
            .into(holder.imageShop)

        holder.tvName.text = shop.name
        holder.tvAddress.text = shop.address
        holder.tvRating.text = shop.rating.toString()
        holder.tvDistance.text = shop.distance.toString() + " Km"

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listShop[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listShop.size
    }
}