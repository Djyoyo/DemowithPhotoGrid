package com.PhotoGridMaker.Softsimplicity.slicer;

/**
 * Created by Deepak on 2017/12/12.
 */

public class NinePicBitmapSlicer extends BitmapSlicer {

    @Override
    protected int getHorizontalPicNumber() {
        return 3;
    }

    @Override
    protected int getVerticalPicNumber() {
        return 3;
    }
}
