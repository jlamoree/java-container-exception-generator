package com.lamoree;

import com.lamoree.service.FakeService;

public class Main {
    public static void main(String[] args) {
        try {
            FakeService fs = new FakeService(15000);
            fs.doStuff();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}