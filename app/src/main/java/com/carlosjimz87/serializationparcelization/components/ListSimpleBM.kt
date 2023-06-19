package com.carlosjimz87.serializationparcelization.components

import android.view.View
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.annotation.StyleRes
import kotlinx.serialization.Serializable


@Serializable
data class ListSimpleBM(
    @StringRes
    val title: Int,
    val showDivider: Boolean = false,
    @StyleRes
    val titleStyle: Int? = null,
//    val titleListener: View.OnClickListener? = null,
    @StringRes
    var subtitle: Int? = null,
    var subtitleStyle: Int? = null,
//    val subtitleListener: View.OnClickListener? = null,
    @DrawableRes
    val leftIcon: Int? = null,
    @DrawableRes
    val rightIcon: Int? = null,
//    var rightIconListener: View.OnClickListener? = null
)