package org.shepherd.metadata;

public interface MetadataSupport<T> {

    void save(T obj);

    void update(T obj);

    void delete(String name);

    T load(String name);
}
