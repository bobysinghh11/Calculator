package com.stuffshuf.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ArithmeticException
import java.lang.Exception
import java.text.Format
import kotlin.math.floor

class MainActivity : AppCompatActivity() {
    val ADD=1
    val SUB=2
    val MUL=3
    val DIV=4
    var oop='+'


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var mem=0
        var op=0

        btnClr.setOnClickListener {

            tv.text="0"
        }

        btn1.setOnClickListener {
            if (tv.text =="0") tv.text= "1"
            else tv.text = tv.text.toString() + "1"
        }

        btn2.setOnClickListener {
            if(tv.text == "0") tv.text= "2"
            else tv.text=tv.text.toString() + "2"
         }

        btn3.setOnClickListener {
            if (tv.text == "0") tv.text= "3"
            else tv.text=tv.text.toString() + "3"
        }
        btn4.setOnClickListener {
            if (tv.text == "0") tv.text= "4"
            else tv.text=tv.text.toString() + "4"
        }

        btn5.setOnClickListener {
            if (tv.text == "0") tv.text= "5"
            else tv.text=tv.text.toString() + "5"
        }

        btn6.setOnClickListener {
            if (tv.text == "0") tv.text= "6"
            else tv.text=tv.text.toString() + "6"

        }
        btn7.setOnClickListener {
            if (tv.text == "0") tv.text= "7"
            else tv.text=tv.text.toString() + "7"

        }

        btn8.setOnClickListener {
            if (tv.text == "0") tv.text= "8"
            else tv.text=tv.text.toString() + "8"

        }

        btn9.setOnClickListener {
            if (tv.text == "0") tv.text= "9"
            else tv.text=tv.text.toString() + "9"

        }

        btn0.setOnClickListener {
            if (tv.text == "0") tv.text= "0"
            else tv.text=tv.text.toString() + "0"
        }

        btnPlus.setOnClickListener {

            op = ADD
            mem = tv.text.toString().toInt()
            if (tv.text == tv.text)
            {
                tv.text=tv.text.toString() + '+'





        }

        }


        btnMinus.setOnClickListener {
            op=SUB
            mem=tv.text.toString().toInt()
            tv.text="0"
        }

        btnDiv.setOnClickListener {
            op=DIV
            mem = tv.text.toString().toInt()
            tv.text = "0"
        }

        btnMul.setOnClickListener {
            op=MUL
            mem = tv.text.toString().toInt()
            tv.text = "0"
        }

        btnEqual.setOnClickListener {
            if (op == 0) return@setOnClickListener

try {

    when (op) {

        ADD -> tv.text = (mem + tv.text.toString().toInt()).toString()

        SUB -> tv.text = (mem - tv.text.toString().toInt()).toString()

        DIV -> tv.text = (mem / tv.text.toString().toDouble()).toString()

        MUL -> tv.text = (mem * tv.text.toString().toInt()).toString()


    }
}
catch (e: ArithmeticException)
{

}

         }


    }
}
