package com.roger.home.ui.activity

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.roger.base.constant.HomeRouter.ROUTER_HOME_MAIN
import com.roger.base.core.BaseActivity
import com.roger.home.databinding.HomeActivityMainBinding
import com.roger.home.ui.adapter.BannerAdapter
import com.roger.home.ui.vm.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@Route(path = ROUTER_HOME_MAIN)
class HomeActivity : BaseActivity<HomeActivityMainBinding,HomeViewModel>() {
    private val bannerAdapter : BannerAdapter by lazy { BannerAdapter() }

    override fun createViewBinding() = HomeActivityMainBinding.inflate(layoutInflater)

    override fun initView(savedInstanceState: Bundle?) {
        dataBinding.mRecyclerView.adapter = bannerAdapter
        viewModel.bannerListLD.observe(this){
            bannerAdapter.setDataList(it)
        }

        viewModel.getBannerList()
    }
}