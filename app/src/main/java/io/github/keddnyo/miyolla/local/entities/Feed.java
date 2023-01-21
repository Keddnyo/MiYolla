package io.github.keddnyo.miyolla.local.entities;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

import io.github.keddnyo.miyolla.remote.entities.Firmware;

public class Feed {
    @DrawableRes
    int icon;
    @StringRes
    int tag;
    String title, subtitle;
    boolean hasError = false;
    Firmware firmware;

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public boolean getHasError() {
        return hasError;
    }

    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }

    public Firmware getFirmware() {
        return firmware;
    }

    public void setFirmware(Firmware firmware) {
        this.firmware = firmware;
    }
}
