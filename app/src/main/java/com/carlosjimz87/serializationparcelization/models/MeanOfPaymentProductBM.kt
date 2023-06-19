package com.carlosjimz87.serializationparcelization.models

class MeanOfPaymentProductBM(
    val productType: CardTypeSlider = CardTypeSlider.NEW_CARD,
    val productState: CardState? = null,
    val cardNumber: String? = "",
    val hasMobilePayment: Boolean = false,
    val isFrost: Boolean = false,
) : NowPayBaseBM()