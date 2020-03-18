package com.example.jslibrary

import android.util.Log
import android.webkit.JsPromptResult
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView

class JsWebChromClient: WebChromeClient() {

    override fun onJsPrompt(view: WebView?, url: String?, message: String?, defaultValue: String?, result: JsPromptResult?): Boolean {
        Log.e("JsWebChromClient","onJsPrompt $url  $message $defaultValue $result")
        result?.confirm("{result}")
        return true
    }
    override fun onJsAlert(view: WebView?, url: String?, message: String?, result: JsResult?): Boolean {
        Log.e("JsWebChromClient","onJsAlert $url  $message  $result")
        result?.confirm()
        return true
    }

    override fun onJsConfirm(view: WebView?, url: String?, message: String?, result: JsResult?): Boolean {
        Log.e("JsWebChromClient","onJsConfirm $url  $message  $result")
        result?.confirm()
        return true
    }

    override fun onConsoleMessage(message: String?, lineNumber: Int, sourceID: String?) {
        Log.e("JsWebChromClient","onConsoleMessage $message")
        super.onConsoleMessage(message, lineNumber, sourceID)
    }

    override fun onReceivedTitle(view: WebView?, title: String?) {
        Log.e("JsWebChromClient","onReceivedTitle $title")
        super.onReceivedTitle(view, title)
    }


}