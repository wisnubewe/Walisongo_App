package id.silmi.walisongo.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import id.silmi.walisongo.R;
import id.silmi.walisongo.Walisongo;

public class Wali7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wali7);

        WebView webViewWali7;
        webViewWali7 = (WebView) findViewById(R.id.wv_wali7);
        webViewWali7.loadUrl("file:///android_asset/web/sunan_kudus.html");
        webViewWali7.getSettings().setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Wali7.this, Walisongo.class);
        Wali7.this.startActivity(intent);
        Wali7.this.finish();
    }
}
