package com.example.apolloproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buton = (Button) findViewById(R.id.contine);
        Button buton1 = (Button) findViewById(R.id.verify);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.firstlayot);
        TextView second=(TextView)findViewById(R.id.timer);
        RelativeLayout firstlayout = (RelativeLayout) findViewById(R.id.first_layout);
        RelativeLayout secondlayout = (RelativeLayout) findViewById(R.id.second_layout);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstlayout.setVisibility(View.GONE);
                secondlayout.setVisibility(View.VISIBLE);
                CountDownTimer timer=new CountDownTimer(60000,60) {
                    @Override
                    public void onTick(long l) {
                        second.setText( ""+l/1000);

                    }

                    @Override
                    public void onFinish() {


                    }
                }.start();
            }
        });

buton1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,ShopCategory.class);
        startActivity(intent);
    }
});

    }
}