package com.carlosjimz87.serializationparcelization.views.viewmodels

import com.carlosjimz87.serializationparcelization.components.ListSimpleBM
import com.carlosjimz87.serializationparcelization.models.MeanOfPaymentBM
import com.carlosjimz87.serializationparcelization.usecases.MainUseCase

class MainActivityViewModel(
) {
    fun loadLists(): List<ListSimpleBM> {
        return MainUseCase().invoke()
    }
}