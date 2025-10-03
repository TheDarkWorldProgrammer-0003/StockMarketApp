package com.plcoding.stockmarketapp.data.remote

import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface StockApi {
    // get request to the api
    @GET("query?function=LISTING_STATUS")

// this function will return a response body
    suspend fun getListings(@Query("apikey") apiKey: String) : ResponseBody

    companion object{
        const val API_KEY = "CPM63WT5RK3RUJJA" // this is my api key for alphavantage.co
        const val BASE_URL = "https://alphavantage.co" // this is the base url for the api


    }

}