package com.roger.base.core

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.roger.repository.data.BaseResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

open class BaseViewModel : ViewModel() {
    val progressLD = MutableLiveData<Boolean>()

    suspend fun <T> asyncCommonHandling(
        request: suspend () -> Response<BaseResult<T>>,
        success: suspend (T) -> Unit,
        error: (String) -> Unit = {},
        complete: () -> Unit = {},
        successCode:Int = 200,
        showProgress: Boolean = true,
    ) {
        try {
            if (showProgress) progressLD.value = true

            val response = withContext(Dispatchers.IO) { request() }
            if (response.isSuccessful) {
                val result: BaseResult<T> = response.body()!!
                if(result.errorCode == successCode){
                    success(result.data)
                }else{
                    error("请求失败")
                }
            } else {
                error("请求失败")
            }
        } catch (e: Exception) {
            e.printStackTrace()
            //异常处理
            error("请求失败")
        } finally {
            complete()
            if (showProgress) progressLD.value = false
        }
    }
}