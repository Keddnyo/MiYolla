package io.github.keddnyo.miyolla.local.entities;

import io.github.keddnyo.miyolla.remote.entities.Request;
import io.github.keddnyo.miyolla.remote.entities.Response;

public class Feed {
    public final Request request;
    public final Response response;
    public Feed(Request request, Response response) {
        this.request = request;
        this.response = response;
    }
}
