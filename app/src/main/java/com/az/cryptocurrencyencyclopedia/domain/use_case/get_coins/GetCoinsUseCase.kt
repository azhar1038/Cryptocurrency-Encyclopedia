package com.az.cryptocurrencyencyclopedia.domain.use_case.get_coins

import com.az.cryptocurrencyencyclopedia.common.Resource
import com.az.cryptocurrencyencyclopedia.data.remote.dto.toCoin
import com.az.cryptocurrencyencyclopedia.domain.model.Coin
import com.az.cryptocurrencyencyclopedia.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>>{
        return flow {
            try {
                emit(Resource.Loading<List<Coin>>())
                val coins = repository.getCoins().map { it.toCoin() }
                emit(Resource.Success<List<Coin>>(coins))
            } catch (e: HttpException) {
                emit(Resource.Error<List<Coin>>(e.localizedMessage ?: "An unexpected error occurred!"))
            } catch (e: IOException) {
                emit(Resource.Error<List<Coin>>("Failed to reach server, check your internet connection."))
            }
        }
    }
}