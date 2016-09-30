package com.kcode.materialdesignlibrary.base;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.kcode.materialdesignlibrary.R;

/**
 * Created by caik on 2016/9/30.
 */

public class BaseActivity extends AppCompatActivity {

    protected void initToolBar(int titleId){
        initToolBar(getResources().getString(titleId));
    }

    protected void initToolBar(String titleId){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            toolbar.setTitle(titleId);
            toolbar.setTitleTextColor(Color.WHITE);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });
        }
    }
}
