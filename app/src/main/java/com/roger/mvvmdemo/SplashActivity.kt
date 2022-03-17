package com.roger.mvvmdemo

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.alibaba.android.arouter.launcher.ARouter
import com.roger.base.constant.HomeRouter
import com.roger.base.core.BaseActivity
import com.roger.base.core.NoViewModel
import com.roger.mvvmdemo.databinding.ActivitySplashBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow

class SplashActivity : BaseActivity<ActivitySplashBinding,NoViewModel>() {

    override fun createViewBinding()= ActivitySplashBinding.inflate(layoutInflater)

    override fun initView(savedInstanceState: Bundle?) {

    }

    override fun onResume() {
        super.onResume()

        lifecycleScope.launchWhenResumed {
            (3 downTo  0).asFlow().collect{
                dataBinding.tvGotoHome.text = "跳转${it}"
                if (it<=0){
                    gotoHome()
                    return@collect
                }
                delay(1000)
            }
        }
    }

    fun onClick(view:View){
        when(view.id){
            R.id.tvGotoHome->{
                gotoHome()
            }
        }
    }


    private fun gotoHome(){
        ARouter.getInstance().build(HomeRouter.ROUTER_HOME_MAIN).navigation()
        finish()
    }
}