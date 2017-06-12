package id.silmi.walisongo.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;


import id.silmi.walisongo.R;
import id.silmi.walisongo.Walisongo;

public class Wali1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wali1);

        WebView webViewWali1;
        webViewWali1 = (WebView) findViewById(R.id.wv_wali1);
        webViewWali1.loadUrl("file:///android_asset/web/sunan_gresik.html");
        webViewWali1.getSettings().setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Wali1.this, Walisongo.class);
        Wali1.this.startActivity(intent);
        Wali1.this.finish();
    }
}
