package com.example.photoviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        int picid;

    public void ImageClick(View a) {
        ImageView img = (ImageView)a;
        picid = Integer.parseInt(img.getTag().toString());
        SetImage(picid);
        OnClick();
    }
    public void OnClick(){
        ((LinearLayout)findViewById(R.id.layoutmain)).setVisibility(View.INVISIBLE);
        ((LinearLayout)findViewById(R.id.layoutbutt)).setVisibility(View.VISIBLE);
        ((LinearLayout)findViewById(R.id.layoutreturn)).setVisibility(View.VISIBLE);
        ((ImageView)findViewById(R.id.imageView23)).setVisibility(View.VISIBLE);
    }
    public void onReturn(View a){
        ((LinearLayout)findViewById(R.id.layoutmain)).setVisibility(View.VISIBLE);
        ((LinearLayout)findViewById(R.id.layoutbutt)).setVisibility(View.INVISIBLE);
        ((LinearLayout)findViewById(R.id.layoutreturn)).setVisibility(View.INVISIBLE);
        ((ImageView)findViewById(R.id.imageView23)).setVisibility(View.INVISIBLE);
    }
    public void SetImage(int a){
        switch (a){
            case 0 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.a);}
            case 1 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.b);}
            case 2 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.c);}
            case 3 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.d);}
            case 4 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.e);}
            case 5 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.f);}
            case 6 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.g);}
            case 7 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.h);}
            case 8 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.i);}
            case 9 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.j);}
            case 10 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.k);}
            case 11 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.l);}
            case 12 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.m);}
            case 13 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.n);}
            case 14 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.o);}
            case 15 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.p);}
            case 16 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.q);}
            case 17 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.r);}
            case 18 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.s);}
            case 19 -> {((ImageView)findViewById(R.id.imageView23)).setImageResource(R.drawable.t);}
        }

    }

    public void ForPrevious(View a){
        if (picid > 0 ){
            picid = picid - 1;
            SetImage(picid);
        } else if (picid == 0) {
            Toast.makeText(this, "going to last img in folder", Toast.LENGTH_SHORT).show();
            picid = 19;
            SetImage(picid);
        }
    }
    public void ForNext(View a){
        if (picid >= 0 && picid != 19 ){
            picid = picid + 1;
            SetImage(picid);
        } else if (picid == 19) {
            Toast.makeText(this, "going to first img in folder", Toast.LENGTH_SHORT).show();
            picid = 0;
            SetImage(picid);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}