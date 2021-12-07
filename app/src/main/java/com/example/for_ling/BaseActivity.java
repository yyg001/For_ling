package com.example.for_ling;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

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
//       toolbar.setBackgroundColor(getResources().getColor(R.color.save_power_bg));
        tvToolbarTitle = findViewById(R.id.tv_toolbar_title);
        tvToolbarRightText = findViewById(R.id.tv_toolbar_right);
        setSupportActionBar(toolbar);
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowTitleEnabled(false);
        }
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener((v) -> onBackPressed());
        }

        return toolbar;
    }
}