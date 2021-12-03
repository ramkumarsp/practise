package com.designPatterns.builder;

public class BuilderTest {
    public static void main(String[] args) {
        builder u = new builder.UserBuilder().id("100").name("xx").id("244").build();
        System.out.println(u.getId());
        System.out.println(u.getName());
    }
}
