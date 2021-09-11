package com.az.cryptocurrencyencyclopedia.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.az.cryptocurrencyencyclopedia.presentation.coin_detail.CoinDetailView
import com.az.cryptocurrencyencyclopedia.presentation.coin_list.CoinListView
import com.az.cryptocurrencyencyclopedia.presentation.ui.theme.CryptocurrencyEncyclopediaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CryptocurrencyEncyclopediaTheme(darkTheme = true) {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Routes.CoinList.route,
                    ){
                        composable(
                            route = Routes.CoinList.route,
                        ){
                            CoinListView(navController = navController)
                        }

                        composable(
                            route = Routes.CoinDetail.route+"/{coinId}"
                        ){
                            CoinDetailView()
                        }
                    }
                }
            }
        }
    }
}