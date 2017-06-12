package id.silmi.walisongo.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import id.silmi.walisongo.R;
import id.silmi.walisongo.Walisongo;

public class Wali4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wali4);

        WebView webViewWali4;
        webViewWali4 = (WebView) findViewById(R.id.wv_wali4);
        webViewWali4.loadUrl("file:///android_asset/web/sunan_giri.html");
        webViewWali4.getSettings().setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Wali4.this, Walisongo.class);
        Wali4.this.startActivity(intent);
        Wali4.this.finish();
    }
}
