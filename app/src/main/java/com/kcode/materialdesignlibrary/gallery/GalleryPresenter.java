package com.kcode.materialdesignlibrary.gallery;

/**
 * Created by caik on 2016/9/30.
 */

public class GalleryPresenter implements GalleryContract.Presenter {

    private final GalleryContract.View mGalleryView;

    public GalleryPresenter(GalleryContract.View view) {
        mGalleryView = view;
        mGalleryView.setPresenter(this);
    }

    @Override
    public void loadTask() {
        mGalleryView.showLoading();



    }

    @Override
    public void start() {

    }
}
