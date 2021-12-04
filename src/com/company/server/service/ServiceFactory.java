package com.company.server.service;


import com.company.server.service.impl.ServerServiceImpl;

public final class ServiceFactory {

    private static final ServiceFactory instance = new ServiceFactory();

    private final ServerService applianceService = new ServerServiceImpl();

    private ServiceFactory() {}

    public ServerService getApplianceService() {

        return applianceService;
    }

    public static ServiceFactory getInstance() {
        return instance;
    }

}