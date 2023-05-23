package org.shepherd.core;

public interface ShepherdApplicationContext {

    String getId();

    String getApplicationName();

    String getDisplayName();

    long getStartupDate();

    ShepherdApplicationContext getParent();
}
