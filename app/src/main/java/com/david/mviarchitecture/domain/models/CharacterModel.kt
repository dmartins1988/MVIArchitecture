package com.david.mviarchitecture.domain.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterModel(
    @SerializedName("better_call_saul_appearance")
    var betterCallSaulAppearance: List<Int>? = null,
    @SerializedName("birthday")
    var birthday: String? = null,
    @SerializedName("category")
    var category: String? = null,
    @SerializedName("char_id")
    var charId: Int? = null,
    @SerializedName("img")
    var img: String? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("nickname")
    var nickname: String? = null,
    @SerializedName("occupation")
    var occupation: List<String>? = null,
    @SerializedName("portrayed")
    var portrayed: String? = null,
    @SerializedName("status")
    var status: String? = null
) : Parcelable