package com.carlosjimz87.serializationparcelization.usecases

import com.carlosjimz87.serializationparcelization.Constants.SAMPLE_SIMPLE_LISTS
import com.carlosjimz87.serializationparcelization.models.MeanOfPaymentBM
import com.carlosjimz87.serializationparcelization.models.MeanOfPaymentCardInfoBM

class MainUseCase {

    operator fun invoke(): MeanOfPaymentBM {
        return MeanOfPaymentBM(MeanOfPaymentCardInfoBM(SAMPLE_SIMPLE_LISTS))
    }
}