package com.uml.java;

public class GameObject {
    private boolean enabled;
    private String name;
    private String tag;

    public void OnCollision(GameObject other){

    }


    public final boolean isEnabled() {
        return enabled;
    }

    public final void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    final public String getTag() {
        return tag;
    }

    final public void setTag(String tag) {
        this.tag = tag;
    }
}


//packages prevent name conflicts
//        divide the application into manageable modules
//        Makes searching/locating classes/interfaces easier
//provide controlled access to classes/interfaces
// In java all methods can be overriten, to prevent this using the final key words would be necessary. at times leaving this out may generate subtle bugs that may be difficult to
//fix