package org.shepherd.core;

import java.util.List;

public interface MetadataConfigContext {

    <T> T get(String url, T tClass);

    <T> T create(T obj);

    boolean contains(String url);

    boolean isMultiCall(String url);
}
