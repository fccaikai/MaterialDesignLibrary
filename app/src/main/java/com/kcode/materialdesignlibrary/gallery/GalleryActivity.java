package com.kcode.materialdesignlibrary.gallery;

import android.os.Bundle;

import com.kcode.materialdesignlibrary.R;
import com.kcode.materialdesignlibrary.base.BaseActivity;
import com.kcode.materialdesignlibrary.utils.ActivityUtils;

public class GalleryActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        initToolBar("Gallery");

        ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                GalleryFragment.newInstance(),R.id.container);

    }
}
