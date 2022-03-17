package com.roger.repository.service

import com.roger.repository.data.BaseResult
import com.roger.repository.data.HomeBanner
import retrofit2.Response
import retrofit2.http.GET

interface WanAndroidService {

    @GET("/banner/json")
    suspend fun getBannerList() : Response<BaseResult<List<HomeBanner>>>
}