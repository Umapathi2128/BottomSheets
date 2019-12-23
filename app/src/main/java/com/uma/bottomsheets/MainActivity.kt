package com.uma.bottomsheets

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.bottom_sheet.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClickListener(view: View) {
        val btn = view as Button
        when (btn.id) {
            R.id.btnPersistent -> {
//                val myBottomSheetDialog = BottomSheetDialog(this)
//                myBottomSheetDialog.txtCost.text= ("Bottom Sheet Dialog")
////               myBottomSheetDialog.setTvSubTitle("Read more...")
////               myBottomSheetDialog.setIvAvatar("https://avatars3.githubusercontent.com/u/6635954?v=3&u=d18aab686938ecda4b96f29e4e3b776008ced91f&s=400")
//                myBottomSheetDialog.setCanceledOnTouchOutside(false)
//                myBottomSheetDialog.show()

                startActivity(Intent(this, PersistantBottomSheetActivity::class.java))
//               finish()
            }
            R.id.btnModal -> {
                startActivity(Intent(this, ModalBottomSheetActivity::class.java))
//                finish()
            }
            R.id.btnCustomDialog -> {
                /**
                 * custom dialog with default Bottom sheet Dialog.
                 * Created bottom sheet dialog by clicking the button....
                 */
                val dialog = com.google.android.material.bottomsheet.BottomSheetDialog(this)
                val bottomSheet = layoutInflater.inflate(R.layout.bottom_sheet, null)

                bottomSheet.txtCost.setOnClickListener { dialog.dismiss() }

                dialog.setContentView(bottomSheet)
                dialog.show()
//                dialog.setCancelable(false)
                dialog.setCanceledOnTouchOutside(false)
            }
            R.id.btnNormalDialog ->{
                val dialog = MyBottomSheetDialog(this)
//                dialog.setTitle("Bottom sheet Dialog")
//                dialog.txtCost.text = "abcd"
                dialog.show()
            }
            else -> {
            }
        }
    }
}
