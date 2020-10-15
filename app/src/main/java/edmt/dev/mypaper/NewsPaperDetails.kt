package edmt.dev.mypaper

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class NewsPaperDetails : AppCompatActivity() {

    private var webView: WebView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_paper_details)
        webView = findViewById(R.id.webView)


        this.webView!!.webViewClient = WebViewClient()

        val intent = intent
        val value = intent.getStringExtra("key")
        // this will load the url of the website
        if (value != null) {
            this.webView!!.loadUrl(value)
        }

        // this will enable the javascript settings
        webView!!.settings.javaScriptEnabled = true

        // if you want to enable zoom feature
        webView!!.settings.setSupportZoom(true)
    }
}