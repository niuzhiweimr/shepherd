package org.shepherd.core;

public interface MetadataConfigContext {

    <T> T get(String url, Class<T> tClass);

    <T> T create(T obj);

    boolean contains(String url);

    boolean isMultiCall(String url);
}
