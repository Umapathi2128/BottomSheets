package com.uma.bottomsheets

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.bottom_sheet.*
import kotlinx.android.synthetic.main.content_main.*


class PersistantBottomSheetActivity : AppCompatActivity() {

    private lateinit var sheetBehavior: BottomSheetBehavior<LinearLayout>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persistant_bottom_sheet)

        sheetBehavior = BottomSheetBehavior.from(root_bottom_sheets)

        bottomSheetCallBacks()
    }

    /**
     * Perform button click operation...
     */
    fun onClickListener(view: View) {
        when (view as Button) {
            btn_bottom_sheets -> {
                when {
                    sheetBehavior.state != BottomSheetBehavior.STATE_EXPANDED -> {
                        btn_bottom_sheets.text = "Colapse Bottom Sheet"
                        sheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
                    }
                    else -> {
                        btn_bottom_sheets.text = "Show Bottom Sheet"
                        sheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
                    }
                }
            }
            else -> {
            }
        }
    }

    /**
     * Bottom sheet state change listener
     * we are changing the button text while state changed....
     */
    private fun bottomSheetCallBacks() {
        sheetBehavior.setBottomSheetCallback(object : BottomSheetBehavior.BottomSheetCallback() {
            override fun onSlide(p0: View, p1: Float) {
            }

            override fun onStateChanged(p0: View, newState: Int) {
                when (newState) {
                    BottomSheetBehavior.STATE_EXPANDED -> {
                        btn_bottom_sheets.text = "Colapse Bottom Sheet"
                    }
                    BottomSheetBehavior.STATE_COLLAPSED -> {
                        btn_bottom_sheets.text = "Show Bottom Sheet"
                    }
                    BottomSheetBehavior.STATE_HALF_EXPANDED -> {
                        btn_bottom_sheets.text = "Half expanded Bottom Sheet"
                    }
                    BottomSheetBehavior.STATE_SETTLING -> {
                    }
                    BottomSheetBehavior.STATE_HIDDEN -> {
                        btn_bottom_sheets.text = "Show Bottom Sheet"
                    }
                    BottomSheetBehavior.STATE_DRAGGING -> {
                    }
                    BottomSheetBehavior.PEEK_HEIGHT_AUTO -> {
                    }
                }
            }
        })
    }
}
