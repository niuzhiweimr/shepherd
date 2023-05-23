package org.shepherd.core;

public abstract class AbstractShepherdApplicationContext implements ShepherdApplicationContext {

    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getApplicationName() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public long getStartupDate() {
        return 0;
    }

    @Override
    public ShepherdApplicationContext getParent() {
        return null;
    }
}
