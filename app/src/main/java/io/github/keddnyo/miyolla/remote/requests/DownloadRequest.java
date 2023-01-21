package io.github.keddnyo.miyolla.remote.requests;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;

import androidx.annotation.NonNull;

import io.github.keddnyo.miyolla.R;
import io.github.keddnyo.miyolla.utils.UriUtils;

public class DownloadRequest {

    public static void enqueue(@NonNull Context context, String url) {
        Uri uri = Uri.parse(url);
        DownloadManager downloadManager = (DownloadManager) context.getSystemService(Context.DOWNLOAD_SERVICE);
        String downloadDirectory = Environment.DIRECTORY_DOWNLOADS;
        String appName = context.getString(R.string.app_name);
        String fileName = UriUtils.getFileName(uri);
        String filePath = appName + "/" + fileName;

        try {
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setDestinationInExternalPublicDir(downloadDirectory, filePath);
            request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
            request.setAllowedOverRoaming(false);
            downloadManager.enqueue(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
