package id.silmi.walisongo.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import id.silmi.walisongo.R;
import id.silmi.walisongo.Walisongo;

public class Wali9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wali9);

        WebView webViewWali9;
        webViewWali9 = (WebView) findViewById(R.id.wv_wali9);
        webViewWali9.loadUrl("file:///android_asset/web/sunan_gunungjati.html");
        webViewWali9.getSettings().setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Wali9.this, Walisongo.class);
        Wali9.this.startActivity(intent);
        Wali9.this.finish();
    }
}
