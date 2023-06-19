package com.carlosjimz87.serializationparcelization.models

class MeanOfPaymentSliderBM(
    val brand: String,
    val contractNumber: String,
    val product: List<MeanOfPaymentProductBM>
) : NowPayBaseBM()