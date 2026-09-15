package com.pemmob.melysaayu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pemmob.melysaayu.ui.screen.BasicInfoScreen
import com.pemmob.melysaayu.ui.screen.HubungiKamiScreen
import com.pemmob.melysaayu.ui.theme.JualanTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JualanTheme {
                // Surface bertindak sebagai kanvas dasar dengan warna latar standar
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Membuat pengontrol navigasi
                    val navController = rememberNavController()

                    // Mengatur NavHost dengan halaman awal "basic_info"
                    NavHost(navController = navController, startDestination = "basic_info") {

                        // Mendaftarkan halaman BasicInfoScreen
                        composable(route = "basic_info") {
                            BasicInfoScreen(
                                onNavigateToContact = { navController.navigate(route = "form_screen") }
                            )
                        }

                        // Mendaftarkan halaman HubungiKamiScreen
                        composable(route = "form_screen") {
                            HubungiKamiScreen(navController = navController)
                        }

                    }
                }
            }
        }
    }
}