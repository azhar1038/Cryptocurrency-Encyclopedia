package com.az.cryptocurrencyencyclopedia.domain.use_case.get_coin

import com.az.cryptocurrencyencyclopedia.common.Resource
import com.az.cryptocurrencyencyclopedia.data.remote.dto.toCoinDetail
import com.az.cryptocurrencyencyclopedia.domain.model.CoinDetail
import com.az.cryptocurrencyencyclopedia.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> {
        return flow {
            try {
                emit(Resource.Loading<CoinDetail>())
                val coin = repository.getCoinById(coinId).toCoinDetail()
                emit(Resource.Success<CoinDetail>(coin))
            } catch (e: HttpException) {
                emit(Resource.Error<CoinDetail>(e.localizedMessage ?: "An unexpected error occurred!"))
            } catch (e: IOException) {
                emit(Resource.Error<CoinDetail>("Failed to reach server, check your internet connection."))
            }
        }
    }
}