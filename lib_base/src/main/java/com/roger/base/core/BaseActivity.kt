package com.roger.base.core

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelLazy
import com.blankj.utilcode.util.BarUtils
import com.roger.base.R
import com.roger.base.utils.StatusBarUtils
import java.lang.reflect.ParameterizedType
import kotlin.reflect.KClass

abstract class BaseActivity<DB:ViewDataBinding,VM:BaseViewModel> : AppCompatActivity() {

    private fun getVMClass(): KClass<VM> {
        val type = javaClass.genericSuperclass as ParameterizedType
        val tp = type.actualTypeArguments[1]
        val vmClass = tp as Class<VM>
        return vmClass.kotlin
    }

    protected val viewModel: VM by ViewModelLazy(
        getVMClass(),
        { viewModelStore },
        { defaultViewModelProviderFactory }
    )

    protected lateinit var dataBinding: DB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = createViewBinding()
        setContentView(dataBinding.root)
        setTransparentStatusBar()
        registerViewModel()
        dataBinding.lifecycleOwner = this
        initView(savedInstanceState)
    }

    abstract fun createViewBinding(): DB

    private fun registerViewModel() {

    }
    abstract fun initView(savedInstanceState: Bundle?)

    private fun setTransparentStatusBar() {
        StatusBarUtils.setImmersionBar(
            this, Color.TRANSPARENT,
            hideStatusBar = false,
            isDark = true
        )
        findViewById<View>(R.id.viewRoot)?.let {
            it.setPadding(0,BarUtils.getStatusBarHeight(),0,0)
        }
    }
}