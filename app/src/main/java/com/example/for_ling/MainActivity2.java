package com.example.for_ling;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private ImageView imageView;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView=findViewById(R.id.IV);
        Intent intent=getIntent();
        int i=intent.getIntExtra("number",0);
//        Toast.makeText(MainActivity2.this,"获取到数字："+i,Toast.LENGTH_SHORT).show();
        switch(i){
            case 1:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a01));
                break;
            case 2:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a02));
                break;
            case 3:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a03));
                break;
            case 4:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a04));
                break;
            case 5:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a05));
                break;
            case 6:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a06));
                break;
            case 7:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a07));
                break;
            case 8:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a08));
                break;
            case 9:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a09));
                break;
            case 10:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a10));
                break;
            case 11:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a11));
                break;
            case 12:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a12));
                break;
            case 13:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a13));
                break;
            case 14:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a14));
                break;
            case 15:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a15));
                break;
            case 16:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a16));
                break;
            case 17:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a17));
                break;
            case 18:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a18));
                break;
            case 19:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a19));
                break;
            case 20:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a20));
                break;
            case 21:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a21));
                break;
            case 22:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a22));
                break;
            case 23:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a23));
                break;
            case 24:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a24));
                break;
            case 25:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a25));
                break;
            case 26:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a26));
                break;
            case 27:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a27));
                break;
            case 28:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a28));
                break;
            case 29:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a29));
                break;
            case 30:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a30));
                break;
            case 31:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a31));
                break;
            case 32:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a32));
                break;
            case 33:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a33));
                break;
            case 34:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.a34));
                break;
            case 35:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.ling));
                break;
            case 36:
                imageView.setImageDrawable(getResources().getDrawable(R.drawable.ling));
                break;

        }
       

    }
}