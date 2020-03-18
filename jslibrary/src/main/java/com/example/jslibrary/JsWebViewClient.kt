package com.example.jslibrary

import android.util.Log
import android.view.KeyEvent
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class JsWebViewClient: WebViewClient() {
    private val TAG = "JsWebViewClient"
    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
        Log.e("JsWebViewClient","shouldOverrideUrlLoading $url")
        view?.loadUrl(url)
        return true
    }

    override fun shouldOverrideKeyEvent(view: WebView?, event: KeyEvent?): Boolean {
        Log.e("JsWebViewClient","shouldOverrideKeyEvent ${event?.keyCode}")
        return super.shouldOverrideKeyEvent(view, event)
    }

    override fun onPageFinished(view: WebView?, url: String?) {
        Log.e("JsWebViewClient","onPageFinished")
        super.onPageFinished(view, url)
    }

    override fun onReceivedError(view: WebView?, errorCode: Int, description: String?, failingUrl: String?) {
        Log.e("JsWebViewClient","onReceivedError $errorCode $description $failingUrl")
        super.onReceivedError(view, errorCode, description, failingUrl)
    }
}