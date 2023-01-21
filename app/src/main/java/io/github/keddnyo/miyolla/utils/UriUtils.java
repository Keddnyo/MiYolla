package io.github.keddnyo.miyolla.utils;

import android.net.Uri;

import androidx.annotation.NonNull;

public class UriUtils {
    @NonNull
    public static String getFileName(@NonNull Uri uri) {
        String urlEncodedPath = uri.getEncodedPath();
        int lastIndex = urlEncodedPath.lastIndexOf('/');
        return urlEncodedPath.substring(lastIndex);
    }
}
