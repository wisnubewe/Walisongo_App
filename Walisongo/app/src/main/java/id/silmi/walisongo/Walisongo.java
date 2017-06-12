package id.silmi.walisongo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

import id.silmi.walisongo.Item.Wali1;
import id.silmi.walisongo.Item.Wali2;
import id.silmi.walisongo.Item.Wali3;
import id.silmi.walisongo.Item.Wali4;
import id.silmi.walisongo.Item.Wali5;
import id.silmi.walisongo.Item.Wali6;
import id.silmi.walisongo.Item.Wali7;
import id.silmi.walisongo.Item.Wali8;
import id.silmi.walisongo.Item.Wali9;

public class Walisongo extends AppCompatActivity {

    Button buttonKembali;
    ImageButton imageButtonWali1;
    ImageButton imageButtonWali2;
    ImageButton imageButtonWali3;
    ImageButton imageButtonWali4;
    ImageButton imageButtonWali5;
    ImageButton imageButtonWali6;
    ImageButton imageButtonWali7;
    ImageButton imageButtonWali8;
    ImageButton imageButtonWali9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walisongo);

        imageButtonWali1 = (ImageButton) findViewById(R.id.imageButtonWali1);

        imageButtonWali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walisongo.this, Wali1.class);
                Walisongo.this.startActivity(intent);
                Walisongo.this.finish();
            }
        });

        imageButtonWali2 = (ImageButton) findViewById(R.id.imageButtonWali2);

        imageButtonWali2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walisongo.this, Wali2.class);
                Walisongo.this.startActivity(intent);
                Walisongo.this.finish();
            }
        });

        imageButtonWali3 = (ImageButton) findViewById(R.id.imageButtonWali3);

        imageButtonWali3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walisongo.this, Wali3.class);
                Walisongo.this.startActivity(intent);
                Walisongo.this.finish();
            }
        });

        imageButtonWali4 = (ImageButton) findViewById(R.id.imageButtonWali4);

        imageButtonWali4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walisongo.this, Wali4.class);
                Walisongo.this.startActivity(intent);
                Walisongo.this.finish();
            }
        });

        imageButtonWali5 = (ImageButton) findViewById(R.id.imageButtonWali5);

        imageButtonWali5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walisongo.this, Wali5.class);
                Walisongo.this.startActivity(intent);
                Walisongo.this.finish();
            }
        });

        imageButtonWali6 = (ImageButton) findViewById(R.id.imageButtonWali6);

        imageButtonWali6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walisongo.this, Wali6.class);
                Walisongo.this.startActivity(intent);
                Walisongo.this.finish();
            }
        });

        imageButtonWali7 = (ImageButton) findViewById(R.id.imageButtonWali7);

        imageButtonWali7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walisongo.this, Wali7.class);
                Walisongo.this.startActivity(intent);
                Walisongo.this.finish();
            }
        });

        imageButtonWali8 = (ImageButton) findViewById(R.id.imageButtonWali8);

        imageButtonWali8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walisongo.this, Wali8.class);
                Walisongo.this.startActivity(intent);
                Walisongo.this.finish();
            }
        });

        imageButtonWali9 = (ImageButton) findViewById(R.id.imageButtonWali9);

        imageButtonWali9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walisongo.this, Wali9.class);
                Walisongo.this.startActivity(intent);
                Walisongo.this.finish();
            }
        });


        buttonKembali = (Button) findViewById(R.id.buttonKembali);


        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Walisongo.this, MainActivity.class);
                Walisongo.this.startActivity(intent);
                Walisongo.this.finish();
            }
        });
    }

    @Override
    public void onBackPressed(){
        Intent intent = new Intent(Walisongo.this, MainActivity.class);
        Walisongo.this.startActivity(intent);
        Walisongo.this.finish();
    }


}
