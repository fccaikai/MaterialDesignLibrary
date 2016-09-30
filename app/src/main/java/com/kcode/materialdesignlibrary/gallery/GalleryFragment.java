package com.kcode.materialdesignlibrary.gallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by caik on 2016/9/30.
 */

public class GalleryFragment extends Fragment implements GalleryContract.View{
    public static GalleryFragment newInstance() {

        Bundle args = new Bundle();

        GalleryFragment fragment = new GalleryFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismissLoading() {

    }

    @Override
    public void showGallery() {

    }

    @Override
    public void setPresenter(GalleryContract.Presenter presenter) {

    }
}
