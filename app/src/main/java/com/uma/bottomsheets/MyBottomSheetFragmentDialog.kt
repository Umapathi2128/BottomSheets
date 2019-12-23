package com.uma.bottomsheets

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.annotation.NonNull
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet.*


/**
 * Created by Umapathi on 2019-12-17.
 * Copyright Indyzen Inc, @2019
 */
class MyBottomSheetFragmentDialog : BottomSheetDialogFragment(){

    private lateinit var sheetBehavior: BottomSheetBehavior<View>
    lateinit var inflateView: View

    //Bottom Sheet Callback
    private val mBottomSheetBehaviorCallback: BottomSheetCallback = object : BottomSheetCallback() {
        override fun onStateChanged(bottomSheet: View, newState: Int) {

            when (newState) {
                BottomSheetBehavior.STATE_HIDDEN -> {
//                        dismiss()
                    sheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                }
                BottomSheetBehavior.STATE_COLLAPSED ->{
                }
                BottomSheetBehavior.STATE_EXPANDED ->{
                }
                else ->{}
            }
        }

        override fun onSlide(bottomSheet: View, slideOffset: Float) {}
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        super.setupDialog(dialog, style)

        //Set the custom view
        inflateView =
            LayoutInflater.from(context).inflate(R.layout.bottom_sheet_dialog,null)
        dialog.setContentView(inflateView)
        sheetBehavior = BottomSheetBehavior.from(inflateView.parent as View)

        //Set the coordinator layout behavior
        val params =
            (inflateView.parent as View).layoutParams as CoordinatorLayout.LayoutParams

        val behavior = params.behavior

        //Set callback
        if (behavior != null && behavior is BottomSheetBehavior<*>) {
            behavior.setBottomSheetCallback(mBottomSheetBehaviorCallback)
        }

        val btnPaymentClick = inflateView.findViewById<Button>(R.id.btnproceedPayment)
        btnPaymentClick.setOnClickListener {
           dialog.dismiss()
        }
    }
}