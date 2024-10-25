package com.technologia.jetnews.presentation.onboarding.components

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.technologia.jetnews.R
import com.technologia.jetnews.presentation.Dimens.mediumPadding1
import com.technologia.jetnews.presentation.Dimens.mediumPadding2
import com.technologia.jetnews.presentation.onboarding.Page
import com.technologia.jetnews.presentation.onboarding.onBoardPages
import com.technologia.jetnews.ui.theme.JetNewsTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    onBoardingPage: Page
) {
    Column(modifier= modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(fraction = 0.6f),
            painter = painterResource(id = onBoardingPage.image),
            contentDescription = "Page1",
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(mediumPadding1))

        Text(
            text = onBoardingPage.title,
            modifier = Modifier.padding(horizontal = mediumPadding2),
            style = MaterialTheme.typography.displaySmall.copy(fontWeight = FontWeight.Bold),
            color = colorResource(id = R.color.display_small)
        )

        Text(
            text = onBoardingPage.description,
            modifier = Modifier.padding(horizontal = mediumPadding2),
            style = MaterialTheme.typography.bodyMedium,
            color = colorResource(id = R.color.text_medium)
        )
    }
}

@Preview(showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Composable
private fun Prev() {
    JetNewsTheme {
        OnBoardingPage(
            onBoardingPage = onBoardPages[0]
        )
    }
}