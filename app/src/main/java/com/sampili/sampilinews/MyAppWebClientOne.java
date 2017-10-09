package com.sampili.sampilinews;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Parimal_Debbarma on 5/2/2017.
 */

@SuppressWarnings("ALL")
public class MyAppWebClientOne extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        if(Uri.parse(url).getHost().endsWith("http://www.pratibadikalam.com/pages/epaper.aspx")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;
    }
}
