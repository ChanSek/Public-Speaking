package io.chanse.kotlinklass.features

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
data class ParcelledPatient(val name: String = "",
                            val id: String,
                            val email: String = "") : Parcelable