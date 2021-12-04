package com.company.server.main;

import com.company.server.service.ServerLogic;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerLogic serverLogic = new ServerLogic();
        serverLogic.startConnection();
    }

}
