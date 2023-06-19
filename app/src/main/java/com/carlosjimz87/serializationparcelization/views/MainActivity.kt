package com.carlosjimz87.serializationparcelization.views

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.carlosjimz87.serializationparcelization.Constants.FIRST_STATE_BUNDLE_TAG
import com.carlosjimz87.serializationparcelization.R.layout
import com.carlosjimz87.serializationparcelization.R.string
import com.carlosjimz87.serializationparcelization.components.ListSimpleBM
import com.carlosjimz87.serializationparcelization.views.viewmodels.MainActivityViewModel
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.Json.Default.encodeToString


class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel = MainActivityViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        getAndProcessListSimples()
    }


    private fun getAndProcessListSimples() {
        val lists = viewModel.loadLists()
        lists.forEach { itemList ->
                when (itemList.title) {
                    string.simple_list_title -> {
                        val intent = Intent(this@MainActivity, ActivitySecond::class.java)

                        intent.putExtra(FIRST_STATE_BUNDLE_TAG, Json.encodeToString(itemList))
                        startActivity(intent)
                    }
                }

        }
    }
}