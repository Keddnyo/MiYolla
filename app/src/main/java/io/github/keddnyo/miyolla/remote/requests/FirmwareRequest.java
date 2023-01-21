package io.github.keddnyo.miyolla.remote.requests;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import io.github.keddnyo.miyolla.activities.MainActivity;
import io.github.keddnyo.miyolla.local.entities.Feed;
import io.github.keddnyo.miyolla.remote.entities.Firmware;
import io.github.keddnyo.miyolla.remote.entities.WearDevice;
import io.github.keddnyo.miyolla.remote.repository.LanguageRepository;
import io.github.keddnyo.miyolla.remote.repository.WearDeviceRepository;

public class FirmwareRequest extends WearDeviceRepository {

    @Nullable
    private Firmware getFirmware(@NonNull WearDevice wearDeviceEntity, String language) throws IOException, JSONException {

        String urlBuilder = "https://" + "api-mifit-us2.huami.com" + "/devices/ALL/hasNewVersion?" + "deviceSource=" + wearDeviceEntity.deviceSource + "&" + "productionSource=" + wearDeviceEntity.productionSource + "&" + "appVersion=" + wearDeviceEntity.application.appVersion + "&" + "firmwareVersion=0&" + "resourceVersion=0&" + "baseResourceVersion=0&" + "gpsVersion=0&" + "fontVersion=0&" + "deviceType=ALL&" + "userId=0&" + "support8Bytes=true&";

        URL url = new URL(urlBuilder);

        URLConnection connection = url.openConnection();

        connection.setRequestProperty("Appplatform", "android_phone");
        connection.setRequestProperty("Appname", wearDeviceEntity.application.appName);
        connection.setRequestProperty("Apptoken", "0");
        connection.setRequestProperty("Lang", language);
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.setRequestProperty("Accept-Encoding", "identity");

        connection.setConnectTimeout(5000);
        connection.setReadTimeout(5000);

        InputStream inputStream = connection.getInputStream();

        int buffedSize = 1024;
        char[] buffer = new char[buffedSize];
        StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(inputStream);
        for (int numRead; (numRead = in.read(buffer, 0, buffer.length)) > 0; ) {
            out.append(buffer, 0, numRead);
        }

        String response = out.toString();

        JSONObject json = new JSONObject(response);

        String firmwareVersion = getStringOrNull(json, "firmwareVersion");
        String firmwareUrl = getStringOrNull(json, "firmwareUrl");
        String resourceVersion = getStringOrNull(json, "resourceVersion");
        String resourceUrl = getStringOrNull(json, "resourceUrl");
        String baseResourceVersion = getStringOrNull(json, "baseResourceVersion");
        String baseResourceUrl = getStringOrNull(json, "baseResourceUrl");
        String fontVersion = getStringOrNull(json, "fontVersion");
        String fontUrl = getStringOrNull(json, "fontUrl");
        String gpsVersion = getStringOrNull(json, "gpsVersion");
        String gpsUrl = getStringOrNull(json, "gpsUrl");
        String changelog = getStringOrNull(json, "changeLog");

        if (firmwareVersion == null) {
            return null;
        } else {
            return new Firmware(firmwareVersion, firmwareUrl, resourceVersion, resourceUrl, baseResourceVersion, baseResourceUrl, fontVersion, fontUrl, gpsVersion, gpsUrl, changelog);
        }
    }

    public void getFirmwareList(MainActivity activity) {
        new Thread(() -> {

            ArrayList<String> languageList = new ArrayList<>();
            languageList.add(LanguageRepository.ENGLISH.code);
            languageList.add(LanguageRepository.CHINESE.code);

            ArrayList<WearDevice> deviceList = initDeviceList();

            activity.progressBar.setVisibility(View.VISIBLE);

            deviceListLoop:
            for (int i = 0; i < deviceList.size(); i++) {
                int deviceIndex = i;
                WearDevice wearDevice = deviceList.get(deviceIndex);

                for (int l = 0; l < languageList.size(); l++) {

                    try {
                        Firmware firmware = getFirmware(deviceList.get(i), languageList.get(l));

                        if (firmware != null) {
                            Feed feed = new Feed();
                            feed.setIcon(wearDevice.deviceIcon);
                            feed.setTitle(wearDevice.deviceName);
                            feed.setSubtitle(firmware.firmwareVersion);
                            feed.setTag(wearDevice.tag);
                            feed.setHasError(false);

                            activity.runOnUiThread(() -> {
                                activity.adapter.addItem(feed);
                                if (deviceIndex + 1 == deviceList.size())
                                    activity.progressBar.setVisibility(View.GONE);
                            });
                            break;
                        }

                    } catch (Exception e) {
                        Feed feed = new Feed();
                        feed.setHasError(true);

                        activity.runOnUiThread(() -> {
                            activity.progressBar.setVisibility(View.GONE);
                            activity.adapter.addItem(feed);
                        });

                        break deviceListLoop;
                    }
                }
            }
        }).start();
    }

    private String getStringOrNull(JSONObject jsonObject, String value) {
        try {
            if (jsonObject.has(value)) {
                return jsonObject.getString(value);
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
}
