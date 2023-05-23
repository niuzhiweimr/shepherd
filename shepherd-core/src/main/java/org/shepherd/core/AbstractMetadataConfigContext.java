package org.shepherd.core;

import org.shepherd.metadata.config.ShepherdServletConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public abstract class AbstractMetadataConfigContext implements MetadataConfigContext {

    private final ConcurrentHashMap<String, ShepherdServletConfig> configMap = new ConcurrentHashMap<>();

    private final ConcurrentHashMap<String, List<ShepherdServletConfig>> multiCallMap = new ConcurrentHashMap<>();

    private final List<String> urls = new ArrayList<>();


    @Override
    public <T> T get(String url, Class<T> tClass) {
        return isMultiCall(url) ? (T) multiCallMap.get(url) : (T) configMap.get(url);
    }

    @Override
    public <T> T create(T obj) {
        return null;
    }

    @Override
    public boolean contains(String url) {
        return false;
    }

    @Override
    public boolean isMultiCall(String url) {
        return multiCallMap.contains(url);
    }
}
