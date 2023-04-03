package com.androiddevs.mvvmnewsapp.api

import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "KE",
        @Query("page")
        pageNumber: Int = 1,

    )
}