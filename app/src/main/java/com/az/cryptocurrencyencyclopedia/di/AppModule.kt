package com.az.cryptocurrencyencyclopedia.di

import com.az.cryptocurrencyencyclopedia.common.Constants
import com.az.cryptocurrencyencyclopedia.data.remote.CoinApi
import com.az.cryptocurrencyencyclopedia.data.repository.CoinRepositoryImpl
import com.az.cryptocurrencyencyclopedia.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCoinApi(): CoinApi {
        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(CoinApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinApi): CoinRepository{
        return CoinRepositoryImpl(api)
    }
}