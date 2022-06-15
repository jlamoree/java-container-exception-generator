package com.lamoree.connector;

public class FakeConnector {

    private final int timeout;

    public FakeConnector(int timeout) {
        this.timeout = timeout;
    }

    public void connect() throws Exception {
        Thread thread = new Thread();
        thread.sleep(timeout);
        throw new Exception("Serious connection issue prevents connection.");
    }
}
