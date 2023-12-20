package com.example.uasdiky

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Hewan(
    val name: String,
    val description: String,
    val photo: Int,
    val sound: String
) : Parcelable
