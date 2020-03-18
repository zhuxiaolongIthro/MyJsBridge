package com.example.jslibrary.interfaces

import android.content.Context
import android.webkit.JavascriptInterface
import android.widget.Toast

class AlertInterface(val context: Context) {
    @JavascriptInterface
    fun showAlert(){

    }
    @JavascriptInterface
    fun showToast(msg:String?){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show()
    }
}