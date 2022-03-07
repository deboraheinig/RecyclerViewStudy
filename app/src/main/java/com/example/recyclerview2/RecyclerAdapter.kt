package com.example.recyclerview2

import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }

    private var titles = arrayOf("Sylveon one", "Sylveon Two", "Sylveon Three", "Sylveon Four")

    private var details = arrayOf("Sylveon one details", "Sylveon two details", "Sylveon three details", "Sylveon four details")

    private var images = intArrayOf(R.drawable.sylveony, R.drawable.sylveon, R.drawable.sylveony, R.drawable.sylveon)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }
        //HOW MANY ITEMS WE ARE PASSING TO OUR VIEW
        override fun getItemCount(): Int {
            return titles.size
        }
}