package com.lynas.ankodemo

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.jetbrains.anko.*

/**
 * Created by sazzad on 5/18/16
 */

class MyFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return UI {
            relativeLayout {
                editText {
                    id = 1
                    hint = "Login info"
                }.lparams {
                    alignParentLeft()
                    alignParentRight()
                }
                button("Login"){

                }.lparams {
                    below(1)
                    alignParentLeft()
                    alignParentRight()
                }
            }
        }.view
    }
}