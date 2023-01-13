package io.github.keddnyo.miyolla.remote.entities;

public class Request {
    public final String deviceName;
    public final int deviceIcon;
    public final int deviceSource;
    public final int productionSource;
    public final Application application;
    public final int tag;

    public Request(String deviceName, int deviceIcon, int deviceSource, int productionSource, Application application, int tag) {
        this.deviceName = deviceName;
        this.deviceIcon = deviceIcon;
        this.deviceSource = deviceSource;
        this.productionSource = productionSource;
        this.application = application;
        this.tag = tag;
    }
}

