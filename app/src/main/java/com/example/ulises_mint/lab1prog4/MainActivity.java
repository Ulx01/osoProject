package com.example.ulises_mint.lab1prog4;

import android.graphics.Color;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{



    ImageView imageOso;
    float x;
    float y;
    int v = 10;
    Button butonLeft;
    Button butonRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageOso = (ImageView)findViewById(R.id.imageOso);
        x = imageOso.getX();
        y = imageOso.getY();
        butonLeft = (Button)findViewById(R.id.buttonMovLeft);
        butonRight = (Button)findViewById(R.id.buttonMovRight);
        butonRight.setOnClickListener(this);
        butonLeft.setOnClickListener(this);
        imageOso.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.buttonMovLeft :
                imageOso.setX(imageOso.getX()-v);
                break;
            case R.id.buttonMovRight:
                imageOso.setX(imageOso.getX()+v);
                break;
            case R.id.imageOso:
                imageOso.setRotation(imageOso.getRotation()+v);
        }
    }
}
