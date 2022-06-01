package com.interview.cognizant;

final class ImmutableEmployee implements Cloneable{
    private String id;
    private String name;

    public ImmutableEmployee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
