package io.github.keddnyo.miyolla.remote.entities;

public class WearDevice {
    public final String deviceName;
    public final int deviceIcon;
    public final int deviceSource;
    public final int productionSource;
    public final Application application;
    public final int tag;

    public WearDevice(String deviceName, int deviceIcon, int deviceSource, int productionSource, Application application, int tag) {
        this.deviceName = deviceName;
        this.deviceIcon = deviceIcon;
        this.deviceSource = deviceSource;
        this.productionSource = productionSource;
        this.application = application;
        this.tag = tag;
    }
}

