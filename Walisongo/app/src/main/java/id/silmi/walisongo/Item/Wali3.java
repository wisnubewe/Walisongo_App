package id.silmi.walisongo.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import id.silmi.walisongo.R;
import id.silmi.walisongo.Walisongo;

public class Wali3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wali3);

        WebView webViewWali3;
        webViewWali3 = (WebView) findViewById(R.id.wv_wali3);
        webViewWali3.loadUrl("file:///android_asset/web/sunan_bonang.html");
        webViewWali3.getSettings().setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Wali3.this, Walisongo.class);
        Wali3.this.startActivity(intent);
        Wali3.this.finish();
    }
}
