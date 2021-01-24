/*
 * Copyright (C) 2021-2022 sunilpaulmathew <sunil.kde@gmail.com>
 *
 * This file is part of The Translator, An application to help translate android apps.
 *
 */

package com.sunilpaulmathew.translator.adapters;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/*
 * Created by sunilpaulmathew <sunil.kde@gmail.com> on January 24, 2021
 */

public class RecycleViewItem implements Serializable {
    private String mTitle;
    private String mDescription;
    private Drawable mIcon;

    public RecycleViewItem(String title, String description, Drawable icon) {
        this.mTitle = title;
        this.mDescription = description;
        this.mIcon = icon;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public Drawable getIcon() {
        return mIcon;
    }

}