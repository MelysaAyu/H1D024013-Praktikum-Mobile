package com.pemmob.melysaayu.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pemmob.melysaayu.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicInfoScreen(onNavigateToContact: () -> Unit) {
    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues) // Memberi jarak aman bawaan Scaffold
                .padding(all = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(180.dp)
                    .clip(CircleShape)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                // Mengganti baris kode nama produk dengan icon aplikasi
                Image(
                    painter = painterResource(id = R.mipmap.ic_launcher_foreground),
                    contentDescription = "Logo Aplikasi",
                    modifier = Modifier.size(120.dp)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Tentang Jualan",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Aplikasi Jualan adalah platform yang mewadahi produk lokal UMKM di wilayah Kabupaten Purbalingga, Jawa Tengah.",
                fontSize = 16.sp,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Mengubah bentuk Row menjadi Card dan menerapkan Tema Material Design
            Card(
                modifier = Modifier.fillMaxWidth(),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.tertiary,
                    contentColor = MaterialTheme.colorScheme.onTertiary
                )
            ) {
                Row(
                    modifier = Modifier.padding(all = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "Misi Kami:",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White,
                        modifier = Modifier.weight(1f)
                    )
                    Text(
                        text = "Memajukan UMKM Lokal",
                        modifier = Modifier.weight(2f)
                    )
                }
            }

            // Memberikan jarak fleksibel agar tombol terdorong ke paling bawah
            Spacer(modifier = Modifier.weight(1f))

            // Menambahkan tombol untuk pindah ke halaman Hubungi Kami
            Button(
                onClick = onNavigateToContact,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
            ) {
                Text("Hubungi Kami", style = MaterialTheme.typography.labelLarge)
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}