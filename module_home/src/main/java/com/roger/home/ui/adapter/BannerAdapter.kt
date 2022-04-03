package com.roger.home.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.roger.home.databinding.HomeItemBannerBinding
import com.roger.repository.data.HomeBanner

class BannerAdapter : RecyclerView.Adapter<BannerAdapter.ViewHolder>() {

    private var dataList: List<HomeBanner> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder.from(parent)

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount() = dataList.size

    fun setDataList(_dataList: List<HomeBanner>) {
        this.dataList = _dataList
        notifyDataSetChanged()
    }

    class ViewHolder private constructor(private val binding: HomeItemBannerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun from(parent: ViewGroup): ViewHolder = ViewHolder(
                HomeItemBannerBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        }

        fun bind(item: HomeBanner) {
            binding.item = item
        }

    }
}