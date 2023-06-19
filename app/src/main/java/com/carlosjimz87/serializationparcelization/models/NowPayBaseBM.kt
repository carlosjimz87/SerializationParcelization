package com.carlosjimz87.serializationparcelization.models

import android.os.Parcel
import android.os.Parcelable

open class NowPayBaseBM : NowPayBaseBMInterface {
    // Implement Parcelable methods
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    override fun writeToParcel(dest: Parcel, flags: Int) {
//        // Write any additional properties to the Parcel
//    }

//    // Implement the CREATOR object
//    companion object CREATOR : Parcelable.Creator<NowPayBaseBM> {
//        override fun createFromParcel(source: Parcel): NowPayBaseBM {
//            // Read the properties from the Parcel and create a new instance of NowPayBaseBM
//            return NowPayBaseBM()
//        }
//
//        override fun newArray(size: Int): Array<NowPayBaseBM?> {
//            return arrayOfNulls(size)
//        }
//    }

    override fun fromDataOutToBM(baseDataOut: BaseDataOut?): NowPayBaseBMInterface {
        return this
    }
}