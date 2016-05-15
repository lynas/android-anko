package com.lynas.ankodemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import org.jetbrains.anko.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /*verticalLayout {
            val name = editText()
            button("Say Hello") {
                onClick { toast("Hello, ${name.text}!") }
            }
        }*/
        relativeLayout{
            editText{
                id = 1
                hint = "name"
                textSize = 24f
            }.lparams{
                alignParentTop()
                alignLeftAndRight()
            }
            editText{
                id = 2
                hint = "age"
            }.lparams {
                below(1)
                alignParentLeft()
                leftOf(3)
            }
            button ("Set"){
                id = 3
            }.lparams {
                below(1)
                alignParentRight()
            }

        }
    }

    private fun RelativeLayout.LayoutParams.alignLeftAndRight() {
        alignParentLeft()
        alignParentRight()
    }
}
