package com.roger.repository.repo

import com.roger.repository.service.WanAndroidService
import javax.inject.Inject

class WanAndroidRepository @Inject constructor(
    private val service:WanAndroidService
) {

    suspend fun getBannerList() = service.getBannerList()
}