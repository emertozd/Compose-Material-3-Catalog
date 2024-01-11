package com.emertozd.compose.catalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.emertozd.compose.catalog.library.Material3CatalogApp
import com.emertozd.compose.catalog.library.data.UserPreferencesRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Load the favorite route before displaying any content, so we can navigate directly to the
        // appropriate screen without flashing the UI at all.
        CoroutineScope(Dispatchers.Default).launch {
            val favoriteRoute = UserPreferencesRepository(this@MainActivity).getFavoriteRoute()
            withContext(Dispatchers.Main) {
                setContent {
                    Material3CatalogApp(initialFavoriteRoute = favoriteRoute)
                }
            }
        }
    }
}
