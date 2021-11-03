package com.designPatterns.builder;

public class builder {

    private final String name;
    private final String id;


    public builder(UserBuilder userBuilderTestbuilder) {
        this.name = userBuilderTestbuilder.name;
        this.id = userBuilderTestbuilder.id;
    }


    public String getName() {
        return name;
    }


    public String getId() {
        return id;
    }

    static class UserBuilder {
        private String name;
        private String id;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder id(String id) {
            this.id = id;
            return this;
        }

        public builder build() {
            builder u = new builder(this);
            return u;
        }
    }
}