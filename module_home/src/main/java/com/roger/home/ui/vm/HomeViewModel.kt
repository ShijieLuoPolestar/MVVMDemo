package com.roger.home.ui.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.roger.base.core.BaseViewModel
import com.roger.repository.data.HomeBanner
import com.roger.repository.repo.WanAndroidRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val wanRepository: WanAndroidRepository
) : BaseViewModel() {
    val bannerListLD = MutableLiveData<List<HomeBanner>>()

    fun getBannerList() {
        viewModelScope.launch {
            asyncCommonHandling({
                wanRepository.getBannerList()
            }, {
                bannerListLD.value = it
            }, successCode = 0)
        }
    }
}