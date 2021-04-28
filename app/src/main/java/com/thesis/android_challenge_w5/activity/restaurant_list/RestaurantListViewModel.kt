package com.thesis.android_challenge_w5.activity.restaurant_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.thesis.android_challenge_w5.data.getRestaurantList
import com.thesis.android_challenge_w5.model.Restaurant

class RestaurantListViewModel : ViewModel(){

    private val restaurantList = MutableLiveData<List<Restaurant>>()

    fun fetchRestaurantList(): LiveData<List<Restaurant>>{
        restaurantList.value = getRestaurantList()
        return restaurantList
    }
}