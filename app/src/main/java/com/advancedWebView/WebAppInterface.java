package com.advancedWebView;

import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class WebAppInterface {

    private MainActivity mContext;

    public WebAppInterface(MainActivity mContext) {
        this.mContext = mContext;
    }

    // Show a toast from the web page
    @JavascriptInterface
    public void showToast(String toast) {
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
        mContext.finish();
    }

    @JavascriptInterface
    public int getAndroidVersion() {
        return android.os.Build.VERSION.SDK_INT;
    }

    @JavascriptInterface
    public void showAndroidVersion(String versionName) {
        Toast.makeText(mContext, versionName, Toast.LENGTH_SHORT).show();
    }
}
