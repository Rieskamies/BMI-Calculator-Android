package com.example.bmi.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel() {

    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    private val weight: Float
        get() = weightInput.toFloatOrNull() ?: 0f

    private val height: Float
        get() = heightInput.toFloatOrNull() ?: 0f

    val bmi: Float
        get() = if (height > 0f && weight > 0f) {
            weight / (height * height)
        } else {
            0f
        }
}
