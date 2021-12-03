package com.learning.java.constructor;

import com.learning.java.pojo.UserPreferenceDetails;

public class ConstructorPractise {
    public static void main(String[] args) {
        UserPreferenceDetails upd = new UserPreferenceDetails();
        new UserPreferenceDetails(0,"",0);
        new UserPreferenceDetails(0,"");
    }
}
