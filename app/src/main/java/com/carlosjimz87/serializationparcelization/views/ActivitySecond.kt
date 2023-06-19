package com.carlosjimz87.serializationparcelization.views

import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.carlosjimz87.serializationparcelization.Constants.FIRST_STATE_BUNDLE_TAG
import com.carlosjimz87.serializationparcelization.components.ListSimpleBM
import com.carlosjimz87.serializationparcelization.databinding.ActivitySecondBinding
import java.io.Serializable

class ActivitySecond : AppCompatActivity() {

    private val TAG = "ActivitySecond"

    private val binding by lazy { ActivitySecondBinding.inflate(layoutInflater) }


    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(binding.root)
        super.onCreate(savedInstanceState)
        // extract info from intent
        processBundle()
    }

    private fun processBundle() {
        val extra = getObjectFromBundle(FIRST_STATE_BUNDLE_TAG, ListSimpleBM::class.java)
        extra?.let {
            binding.textView.text = getString(it.title).also { title ->
                Log.d(TAG, "onCreate: $title")
            }
        }
    }

    private fun <T : Serializable?> getObjectFromBundle(bundleId: String, clazz: Class<T>): T? {
        return intent.extras?.let { bundle ->
            if (VERSION.SDK_INT <= VERSION_CODES.TIRAMISU) {
                bundle.getSerializable(bundleId) as T
            } else {
                bundle.getSerializable(bundleId, clazz)
            }
        }
    }


}