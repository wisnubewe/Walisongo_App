package id.silmi.walisongo.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import id.silmi.walisongo.R;
import id.silmi.walisongo.Walisongo;

public class Wali6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wali6);

        WebView webViewWali6;
        webViewWali6 = (WebView) findViewById(R.id.wv_wali6);
        webViewWali6.loadUrl("file:///android_asset/web/sunan_drajat.html");
        webViewWali6.getSettings().setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Wali6.this, Walisongo.class);
        Wali6.this.startActivity(intent);
        Wali6.this.finish();
    }
}
