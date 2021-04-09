package com.olympe.calculatrice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a: String = "0"
        var b: String = "0"
        var ope: String = "none"
        var res: Float = 0F

        findViewById<Button>(R.id.opeCancel).setOnClickListener {
            a = "0"
            b = "0"
            ope = "none"
            res = 0F
            findViewById<TextView>(R.id.result_box).text = a
        }

        findViewById<Button>(R.id.opePlus).setOnClickListener {
            ope = "+"
            findViewById<TextView>(R.id.result_box).text = a + ope + b
        }

        findViewById<Button>(R.id.opeMultiplie).setOnClickListener {
            ope = "*"
            findViewById<TextView>(R.id.result_box).text = a + ope + b
        }

        findViewById<Button>(R.id.opeDivision).setOnClickListener {
            ope = "/"
            findViewById<TextView>(R.id.result_box).text = a + ope + b
        }

        findViewById<Button>(R.id.opeMoins).setOnClickListener {
            ope = "-"
            findViewById<TextView>(R.id.result_box).text = a + ope + b
        }

        findViewById<Button>(R.id.key0).setOnClickListener {
            if(ope=="none"){
                a += "0"
                findViewById<TextView>(R.id.result_box).text = a
            } else {
                b += "0"
                findViewById<TextView>(R.id.result_box).text = a + ope + b
            }
        }

        findViewById<Button>(R.id.key1).setOnClickListener {
            if(ope=="none"){
                a += "1"
                findViewById<TextView>(R.id.result_box).text = a
            } else {
                b += "1"
                findViewById<TextView>(R.id.result_box).text = a + ope + b
            }
        }

        findViewById<Button>(R.id.key2).setOnClickListener {
            if(ope=="none"){
                a += "2"
                findViewById<TextView>(R.id.result_box).text = a
            } else {
                b += "2"
                findViewById<TextView>(R.id.result_box).text = a + ope + b
            }
        }

        findViewById<Button>(R.id.key3).setOnClickListener {
            if(ope=="none"){
                a += "3"
                findViewById<TextView>(R.id.result_box).text = a
            } else {
                b += "3"
                findViewById<TextView>(R.id.result_box).text = a + ope + b
            }
        }

        findViewById<Button>(R.id.key4).setOnClickListener {
            if(ope=="none"){
                a += "4"
                findViewById<TextView>(R.id.result_box).text = a
            } else {
                b += "4"
                findViewById<TextView>(R.id.result_box).text = a + ope + b
            }
        }

        findViewById<Button>(R.id.key5).setOnClickListener {
            if(ope=="none"){
                a += "5"
                findViewById<TextView>(R.id.result_box).text = a
            } else {
                b += "5"
                findViewById<TextView>(R.id.result_box).text = a + ope + b
            }
        }

        findViewById<Button>(R.id.key6).setOnClickListener {
            if(ope=="none"){
                a += "6"
                findViewById<TextView>(R.id.result_box).text = a
            } else {
                b += "6"
                findViewById<TextView>(R.id.result_box).text = a + ope + b
            }
        }

        findViewById<Button>(R.id.key7).setOnClickListener {
            if(ope=="none"){
                a += "7"
                findViewById<TextView>(R.id.result_box).text = a
            } else {
                b += "7"
                findViewById<TextView>(R.id.result_box).text = a + ope + b
            }
        }

        findViewById<Button>(R.id.key8).setOnClickListener {
            if(ope=="none"){
                a += "8"
                findViewById<TextView>(R.id.result_box).text = a
            } else {
                b += "8"
                findViewById<TextView>(R.id.result_box).text = a + ope + b
            }
        }

        findViewById<Button>(R.id.key9).setOnClickListener {
            if(ope=="none"){
                a += "9"
                findViewById<TextView>(R.id.result_box).text = a
            } else {
                b += "9"
                findViewById<TextView>(R.id.result_box).text = a + ope + b
            }
        }


        findViewById<Button>(R.id.opeRes).setOnClickListener {
            var nb1: Int = a.toInt()
            var nb2: Int = b.toInt()
            if(ope=="+"){
                res = addition(nb1, nb2).toFloat()
            } else if(ope=="-"){
                res = soustraction(nb1,nb2).toFloat()
            } else if(ope=="*"){
                res = multiplication(nb1,nb2).toFloat()
            } else if(ope=="/"){
                res = division(nb1,nb2)
            }
            findViewById<TextView>(R.id.result_box).text = res.toString()
            a = "0"
            b = "0"
            ope = "none"
        }

    }

    fun addition(a: Int, b: Int): Int{
        return a + b
    }

    fun multiplication(a: Int, b: Int): Int{
        return a * b
    }

    fun division(a: Int, b: Int): Float{
        if(b==0){
            return 0F
        }

        return (a/b).toFloat()
    }

    fun soustraction(a: Int, b: Int): Int{
        return (a - b)
    }
}