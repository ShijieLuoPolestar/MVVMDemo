package com.roger.home.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.roger.home.R
import com.roger.home.databinding.HomeItemBannerBinding
import com.roger.repository.data.HomeBanner

class BannerAdapter : RecyclerView.Adapter<BannerAdapter.BannerViewHolder>() {
    private var dataList: List<HomeBanner> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BannerViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.home_item_banner, parent, false)
    )

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
        holder.bind(dataList[position])
    }

    override fun getItemCount() = dataList.size

    fun setDataList(_dataList: List<HomeBanner>) {
        this.dataList = _dataList
        notifyDataSetChanged()
    }

    inner class BannerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val mBinding = DataBindingUtil.bind<HomeItemBannerBinding>(itemView)!!

        fun bind(item:HomeBanner) {
            mBinding.item = item
        }
    }
}