package com.example.for_ling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import static java.lang.Thread.sleep;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_launch);
        try {
            Thread.sleep( 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent intent = new Intent(LaunchActivity.this,MainActivity.class);
        startActivity(intent);
        LaunchActivity.this.finish();

//        new Thread( new Runnable( ) {
//            @Override
//            public void run() {
//                //耗时任务，比如加载网络数据
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            sleep(2000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        Intent intent = new Intent(LaunchActivity.this,MainActivity.class);
//                        startActivity(intent);
//                    }
//                });
//            }
//        } ).start();


    }
}