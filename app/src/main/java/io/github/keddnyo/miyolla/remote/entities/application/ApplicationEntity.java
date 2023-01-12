package io.github.keddnyo.miyolla.remote.entities.application;

public class ApplicationEntity {
    public final String appName;
    public final String appVersion;

    public ApplicationEntity(String appName, String appVersion) {
        this.appName = appName;
        this.appVersion = appVersion;
    }
}
