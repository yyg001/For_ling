package com.example.for_ling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

/**
 * @author yyg
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    protected TextView tvToolbarTitle;
    private TextView tvToolbarRightText;
    protected Toolbar toolbar;

    protected Toolbar initToolbar(String titleString) {
        Toolbar toolbar = initToolbar();
        tvToolbarTitle.setText(titleString);
        return toolbar;
    }
    protected Toolbar initToolbar() {
        toolbar = findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle("");
        }
        tvToolbarTitle = findViewById(R.id.tv_toolbar_title);
        tvToolbarRightText = findViewById(R.id.tv_toolbar_right);
        setSupportActionBar(toolbar);
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);//给左上角图标的左边加上一个返回的图标
            actionBar.setDisplayShowTitleEnabled(false);//左上角的返回箭头右边的标题
        }
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener((v) -> onBackPressed());//设置左上角图标点击后是否有返回效果
        }

        return toolbar;
    }
}