package com.carlosjimz87.serializationparcelization.models

class MeanOfPaymentShortcutsBM(
    val brand: String,
    val contractNumber: String,
    val shortcutBMList: MutableList<MeanOfPaymentShortcutBM>
): NowPayBaseBM()