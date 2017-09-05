package com.example.android.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_message.text ="Hello alkhalifi"
        toast("Hello")
        toast("Hello",Toast.LENGTH_LONG)
        niceToast("Hello","MyTag",Toast.LENGTH_SHORT)

    }

    fun toast(message:String, length:Int = Toast.LENGTH_SHORT){
        Toast.makeText(this,message,length).show();
    }

    fun niceToast(message:String, tag:String = MainActivity::class.java.simpleName,length:Int = Toast.LENGTH_SHORT){
        Toast.makeText(this,"[$tag] $message",length).show();
    }

}
