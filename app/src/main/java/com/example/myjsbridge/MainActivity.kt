package com.example.myjsbridge

import android.os.Build
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {



    private val url = "http://121.35.249.14:9003/sunline/wallet-stock/home/index.html#/"
    private val file = "file:///android_asset/demo.html"
    private val jfUrl="http://www.baidu.com/"
    val webview:WebView by lazy {
        findViewById<WebView>(R.id.web_view)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        webview.loadUrl(file)
    }

    fun back(v:View?){
        if (webview.canGoBack()) {
            webview.goBack()
        }else{
            webview.loadUrl(file)
        }
    }
    fun reload(v:View?){
        webview.loadUrl(jfUrl)
    }
}
