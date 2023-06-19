package com.carlosjimz87.serializationparcelization

import android.util.Log
import com.carlosjimz87.serializationparcelization.R.drawable
import com.carlosjimz87.serializationparcelization.R.string
import com.carlosjimz87.serializationparcelization.components.ListSimpleBM

object Constants {

    const val FIRST_STATE_BUNDLE_TAG = "FIRST_STATE_BUNDLE_TAG"

    val SAMPLE_SIMPLE_LISTS = listOf(
        ListSimpleBM(
            string.simple_list_title,
            true,
            rightIcon = drawable.baseline_arrow_right_24,
            leftIcon = drawable.baseline_arrow_left_24,
//            rightIconListener = {
//                Log.v("MeanOfPaymentCardInfoBM", "AQUÍ NAVEGARÍAMOS A OTRA PÁGINA")
//            }
        ),
        ListSimpleBM(
            string.simple_list_title2,
            true,
            rightIcon = drawable.baseline_arrow_right_24,
            leftIcon = drawable.baseline_arrow_left_24,
        ),
        ListSimpleBM(
            string.simple_list_title3,
            true,
            rightIcon = drawable.baseline_arrow_right_24,
            leftIcon = drawable.baseline_arrow_left_24,
        )
    )
}