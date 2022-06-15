package com.lamoree.service;

import com.lamoree.connector.FakeConnector;

public class FakeService {

    private final int timeout;
    private final FakeConnector fc;

    public FakeService(int timeout) {
        this.timeout = timeout;
        fc = new FakeConnector(timeout);
    }

    public void doStuff() throws Exception {
        fc.connect();
    }

}
