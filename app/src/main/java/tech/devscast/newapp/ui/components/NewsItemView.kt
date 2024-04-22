package tech.devscast.newapp.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import tech.devscast.newapp.R
import tech.devscast.newapp.ui.theme.NewAppTheme
import tech.devscast.newapp.util.MultiPreview

@Composable
fun NewsItemView(modifier: Modifier = Modifier) {
    OutlinedCard(modifier = modifier) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(210.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.image1),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Surface(
                modifier = Modifier
                    .padding(top = 13.dp, end = 20.dp)
                    .size(48.dp)
                    .align(Alignment.TopEnd),
                shape = CircleShape,
                color = Color.White.copy(alpha = 0.4f)
            ) {
                Icon(
                    imageVector = Icons.Default.BookmarkBorder,
                    contentDescription = null,
                    modifier = Modifier.padding(10.dp),
                    tint = Color.White
                )
            }
        }
        Column(modifier = Modifier.padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(text = "Lorem ipsum", style = MaterialTheme.typography.titleLarge)
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor",
                style = MaterialTheme.typography.bodyMedium
            )
            Text(text = "Publié le 24/02/2024", style = MaterialTheme.typography.labelSmall)
        }
    }
}

@MultiPreview
@Composable
private fun NewsItemViewPreview() {
    NewAppTheme {
        NewsItemView()
    }
}