package io.github.keddnyo.miyolla.remote.requests;

import androidx.annotation.Nullable;

import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

import io.github.keddnyo.miyolla.local.adapters.FeedAdapter;
import io.github.keddnyo.miyolla.local.entities.FeedEntity;
import io.github.keddnyo.miyolla.remote.entities.FirmwareRequestEntity;
import io.github.keddnyo.miyolla.remote.entities.FirmwareResponseEntity;
import io.github.keddnyo.miyolla.remote.repository.WearDeviceRepository;
import io.github.keddnyo.miyolla.remote.utils.AsyncTask;

public class FirmwareRequest extends WearDeviceRepository implements AsyncTask {

    final FeedAdapter adapter;

    public FirmwareRequest(FeedAdapter adapter) {
        this.adapter = adapter;
    }

    @Nullable
    private FirmwareResponseEntity getFirmware(FirmwareRequestEntity requestEntity, String language) throws MalformedURLException {

        String urlBuilder = "https://" + "api-mifit-us2.huami.com" + "/devices/ALL/hasNewVersion?" + "deviceSource=" + requestEntity.deviceSource + "&" + "productionSource=" + requestEntity.productionSource + "&" + "appVersion=" + requestEntity.application.appVersion + "&" + "firmwareVersion=0&" + "resourceVersion=0&" + "baseResourceVersion=0&" + "gpsVersion=0&" + "fontVersion=0&" + "deviceType=ALL&" + "userId=0&" + "support8Bytes=true&";

        try {
            URL url = new URL(urlBuilder);

            URLConnection connection = url.openConnection();

            connection.setRequestProperty("Appplatform", "android_phone");
            connection.setRequestProperty("Appname", requestEntity.application.appName);
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
                return new FirmwareResponseEntity(firmwareVersion, firmwareUrl, resourceVersion, resourceUrl, baseResourceVersion, baseResourceUrl, fontVersion, fontUrl, gpsVersion, gpsUrl, changelog);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void getFirmwareList() {

        executorService.execute(() -> {

            ArrayList<String> languageList = new ArrayList<>();
            languageList.add("en_US");
            languageList.add("zh_CH");

            ArrayList<FirmwareRequestEntity> source = initDeviceList();

            for (int i = 0; i < source.size(); i++) {
                for (int l = 0; l < languageList.size(); l++) {
                    try {
                        FirmwareResponseEntity response = getFirmware(source.get(i), languageList.get(l));
                        if (response != null) {
                            int finalI = i;
                            handler.post(() -> adapter.addItem(new FeedEntity(
                                    source.get(finalI), response
                            )));
                            break;
                        }
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

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
