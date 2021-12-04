package com.company.server.entity.info;

import java.util.List;

public interface Info {
    @Override
    public String toString();
    public List<String> getParameters();
}