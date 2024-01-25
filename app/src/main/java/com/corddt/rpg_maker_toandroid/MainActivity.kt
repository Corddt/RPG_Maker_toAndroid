package com.corddt.rpg_maker_toandroid

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.webkit.WebView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.corddt.rpg_maker_toandroid.ui.theme.RPG_Maker_toAndroidTheme

class MainActivity() : ComponentActivity(), Parcelable {
    private lateinit var webview: WebView

    constructor(parcel: Parcel) : this() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        webview = WebView(this)
        webview.settings.javaScriptEnabled = true
        webview.settings.allowFileAccessFromFileURLs = true

        // 最后加载页面（注：android_asset 是固定写法）
        webview.loadUrl("file:///android_asset/www/index.html")
        setContentView(webview)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    @Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RPG_Maker_toAndroidTheme {
        Greeting("Android")
    }
}
}