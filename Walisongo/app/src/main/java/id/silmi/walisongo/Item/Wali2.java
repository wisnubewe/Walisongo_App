package id.silmi.walisongo.Item;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import id.silmi.walisongo.R;
import id.silmi.walisongo.Walisongo;

public class Wali2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wali2);

        WebView webViewWali2;
        webViewWali2 = (WebView) findViewById(R.id.wv_wali2);
        webViewWali2.loadUrl("file:///android_asset/web/sunan_ampel.html");
        webViewWali2.getSettings().setJavaScriptEnabled(true);

    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Wali2.this, Walisongo.class);
        Wali2.this.startActivity(intent);
        Wali2.this.finish();
    }
}
