package com.example.for_ling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        initToolbar("我是臭屁玲");
        ImageView imageView=findViewById(R.id.iv_toolbar_right);
        TextView textView=findViewById(R.id.tv_toolbar_right);
        textView.setVisibility(View.VISIBLE);
        textView.setText("yyg");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"点击了文字",Toast.LENGTH_SHORT).show();
            }
        });
        imageView.setImageResource(R.drawable.a03);
        imageView.setVisibility(View.VISIBLE);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"fjdaskf",Toast.LENGTH_SHORT).show();
            }
        });
    }
}