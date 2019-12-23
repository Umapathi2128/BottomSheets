package com.uma.bottomsheets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.activity_modal_bottom_sheet.*

class ModalBottomSheetActivity : AppCompatActivity() {
    private lateinit var bottomSheetDialogFragment: BottomSheetDialogFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modal_bottom_sheet)
    }

    fun setClickListener(view : View){
        when(view as Button){
            btn_bottom_sheet_dialog_fragment ->{

                //Show the Bottom Sheet Fragment
                bottomSheetDialogFragment = MyBottomSheetFragmentDialog()
                bottomSheetDialogFragment.show(
                    supportFragmentManager,
                    "Bottom Sheet Dialog Fragment"
                )
                bottomSheetDialogFragment.isCancelable = false
//                if (bottomSheetDialogFragment.state != BottomSheetBehavior.STATE_EXPANDED) {
//                    btn_bottom_sheets.text = "Colapse Bottom Sheet"
//                    sheetBehavior.state = BottomSheetBehavior.STATE_EXPANDED
//                } else {
//                    btn_bottom_sheets.text = "Show Bottom Sheet"
//                    sheetBehavior.state = BottomSheetBehavior.STATE_COLLAPSED
//                }
            }
            else ->{}
        }
    }
}
