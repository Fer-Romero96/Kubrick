package edu.itesm.stanley

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class Actor(val picture:Int,
                 val name:String,
                 val movie:String,
                 val plot: String) : Parcelable
