package id.silmi.walisongo.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import id.silmi.walisongo.R;
import id.silmi.walisongo.Walisongo;

public class Wali5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wali5);

        WebView webViewWali5;
        webViewWali5 = (WebView) findViewById(R.id.wv_wali5);
        webViewWali5.loadUrl("file:///android_asset/web/sunan_kalijaga.html");
        webViewWali5.getSettings().setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Wali5.this, Walisongo.class);
        Wali5.this.startActivity(intent);
        Wali5.this.finish();
    }
}
