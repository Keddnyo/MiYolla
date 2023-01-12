package io.github.keddnyo.miyolla.local.entities;

import io.github.keddnyo.miyolla.remote.entities.FirmwareRequestEntity;
import io.github.keddnyo.miyolla.remote.entities.FirmwareResponseEntity;

public class FeedEntity {
    public final FirmwareRequestEntity source;
    public final FirmwareResponseEntity remote;

    public FeedEntity(FirmwareRequestEntity firmwareRequestEntity, FirmwareResponseEntity firmwareResponseEntity) {
        this.source = firmwareRequestEntity;
        this.remote = firmwareResponseEntity;
    }
}
