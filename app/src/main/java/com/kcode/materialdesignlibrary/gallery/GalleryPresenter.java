package com.kcode.materialdesignlibrary.gallery;

/**
 * Created by caik on 2016/9/30.
 */

public class GalleryPresenter implements GalleryContract.Presenter {

    public GalleryPresenter(GalleryContract.View view) {
        view.setPresenter(this);
    }

    @Override
    public void loadTask() {

    }

    @Override
    public void start() {

    }
}
