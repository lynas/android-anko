package com.lynas.ankodemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import org.jetbrains.anko.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        linearLayout {
            id = 1
            fragmentManager.beginTransaction().replace(1, MyFragment()).commit()

        }

    }

}
