package com.example.age.demobinding2;

import android.databinding.BindingAdapter;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.ImageButton;

/**
 * Created by Age on 3/20/2017.
 */
public class CustomSetters {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @BindingAdapter("imgSrc")
    public static void setImgSrc(ImageButton view, int resId) {
        view.setImageDrawable(view.getContext().getDrawable(resId));
    }
}
