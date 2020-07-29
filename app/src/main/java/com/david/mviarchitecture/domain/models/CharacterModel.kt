package com.david.mviarchitecture.domain.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterModel(
    @SerializedName("better_call_saul_appearance")
    var betterCallSaulAppearance: List<Int>?,
    @SerializedName("birthday")
    var birthday: String?,
    @SerializedName("category")
    var category: String?,
    @SerializedName("char_id")
    var charId: Int?,
    @SerializedName("img")
    var img: String?,
    @SerializedName("name")
    var name: String?,
    @SerializedName("nickname")
    var nickname: String?,
    @SerializedName("occupation")
    var occupation: List<String>?,
    @SerializedName("portrayed")
    var portrayed: String?,
    @SerializedName("status")
    var status: String?
) : Parcelable