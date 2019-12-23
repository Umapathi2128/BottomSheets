package com.uma.bottomsheets

import android.content.Context
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.bottom_sheet.*

/**
 * Created by Umapathi on 2019-12-20.
 * Copyright Indyzen Inc, @2019
 */
class MyBottomSheetDialog(context: Context) : BottomSheetDialog(context) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.bottom_sheet)

        txtCost.setOnClickListener {
            dismiss()
        }
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()
    }


}