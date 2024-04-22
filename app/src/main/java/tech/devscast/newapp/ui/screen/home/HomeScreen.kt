package tech.devscast.newapp.ui.screen.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import tech.devscast.newapp.ui.components.NewsItemView
import tech.devscast.newapp.ui.theme.NewAppTheme
import tech.devscast.newapp.util.MultiPreview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = "NewsApp", style = MaterialTheme.typography.titleMedium)
                }
            )
        }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier.padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(10) {
                NewsItemView()
            }
        }
    }
}

@MultiPreview
@Composable
private fun HomeScreenPreview() {
    NewAppTheme {
        HomeScreen()
    }
}