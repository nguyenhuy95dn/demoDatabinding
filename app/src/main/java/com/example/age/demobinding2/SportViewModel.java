package com.example.age.demobinding2;

import android.databinding.ObservableInt;

/**
 * Created by Age on 3/20/2017.
 */
public class SportViewModel {
    public final ObservableInt imgSrcId = new ObservableInt();
    public String sportName;

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public ObservableInt getImgSrcId() {
        return imgSrcId;
    }
}
