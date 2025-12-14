package com.example.bmi.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bmi.R
import com.example.bmi.viewmodels.BmiViewModel

@Composable
fun BMI(modifier: Modifier = Modifier, bmiViewModel: BmiViewModel = viewModel()) {
    Column (
        modifier = modifier.padding(all = 8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = stringResource(R.string.hr_limits),
            style=MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = bmiViewModel.heightInput,
            onValueChange = {bmiViewModel.heightInput = it},
            label={Text("Height")},
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType =
                    KeyboardType.Number
            ),
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = bmiViewModel.weightInput,
            onValueChange = {bmiViewModel.weightInput = it},
            label={Text("Weight")},
            singleLine = true,
            keyboardOptions = KeyboardOptions(
                keyboardType =
                    KeyboardType.Number
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Text(text = stringResource(R.string.result_is_s_s,bmiViewModel.bmi))
    }
}