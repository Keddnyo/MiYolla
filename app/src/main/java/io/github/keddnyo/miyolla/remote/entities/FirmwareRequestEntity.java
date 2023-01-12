package io.github.keddnyo.miyolla.remote.entities;

import io.github.keddnyo.miyolla.remote.entities.application.ApplicationEntity;

public class FirmwareRequestEntity {
    public final String deviceName;
    public final int deviceIcon;
    public final int deviceSource;
    public final int productionSource;
    public final ApplicationEntity application;
    public final boolean hasNFC;

    public FirmwareRequestEntity(String deviceName, int deviceIcon, int deviceSource, int productionSource, ApplicationEntity application, boolean hasNFC) {
        this.deviceName = deviceName;
        this.deviceIcon = deviceIcon;
        this.deviceSource = deviceSource;
        this.productionSource = productionSource;
        this.application = application;
        this.hasNFC = hasNFC;
    }
}

