package com.kcode.materialdesignlibrary.gallery;

import com.kcode.materialdesignlibrary.BasePresenter;
import com.kcode.materialdesignlibrary.BaseView;

/**
 * Created by caik on 2016/9/30.
 */

public interface GalleryContract {

    interface View extends BaseView<Presenter>{
        void showLoading();
        void dismissLoading();
        void showGallery();
    }

    interface Presenter extends BasePresenter{
        void loadTask();
    }
}
