package com.carlosjimz87.serializationparcelization.models

import java.io.Serializable

interface NowPayBaseBMInterface: Serializable {
    fun fromDataOutToBM(baseDataOut: BaseDataOut?): NowPayBaseBMInterface
}