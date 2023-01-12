package io.github.keddnyo.miyolla.remote.entities;

public class FirmwareResponseEntity {
    public final String firmwareVersion;
    public final String firmwareUrl;
    public final String resourceVersion;
    public final String resourceUrl;
    public final String baseResourceVersion;
    public final String baseResourceUrl;
    public final String fontVersion;
    public final String fontUrl;
    public final String gpsVersion;
    public final String gpsUrl;
    public final String changeLog;

    public FirmwareResponseEntity(String firmwareVersion, String firmwareUrl, String resourceVersion, String resourceUrl, String baseResourceVersion, String baseResourceUrl, String fontVersion, String fontUrl, String gpsVersion, String gpsUrl, String changeLog) {
        this.firmwareVersion = firmwareVersion;
        this.firmwareUrl = firmwareUrl;

        this.resourceVersion = resourceVersion;
        this.resourceUrl = resourceUrl;

        this.baseResourceVersion = baseResourceVersion;
        this.baseResourceUrl = baseResourceUrl;

        this.fontVersion = fontVersion;
        this.fontUrl = fontUrl;

        this.gpsVersion = gpsVersion;
        this.gpsUrl = gpsUrl;

        this.changeLog = changeLog;
    }
}
