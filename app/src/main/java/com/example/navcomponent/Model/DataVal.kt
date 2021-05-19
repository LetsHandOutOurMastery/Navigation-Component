package com.example.navcomponent.Model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize
data class DataVal(var amount: BigDecimal): Parcelable {

}