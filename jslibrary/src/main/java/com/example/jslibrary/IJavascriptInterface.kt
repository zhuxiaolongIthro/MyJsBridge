package com.example.jslibrary

import android.util.Log
import android.webkit.JavascriptInterface

open class IJavascriptInterface {
    @JavascriptInterface
    fun send(data:String?) {
        Log.e("IJavascriptInterface","send")
    }

    @JavascriptInterface
    fun response(){
        Log.e("IJavascriptInterface","response")
    }
}