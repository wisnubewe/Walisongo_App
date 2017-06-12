package id.silmi.walisongo.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import id.silmi.walisongo.R;
import id.silmi.walisongo.Walisongo;

public class Wali8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wali8);

        WebView webViewWali8;
        webViewWali8 = (WebView) findViewById(R.id.wv_wali8);
        webViewWali8.loadUrl("file:///android_asset/web/sunan_muria.html");
        webViewWali8.getSettings().setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Wali8.this, Walisongo.class);
        Wali8.this.startActivity(intent);
        Wali8.this.finish();
    }
}
