package com.practise.java.constructor;

import com.practise.java.pojo.UserPreferenceDetails;

public class ConstructorPractise {
    public static void main(String[] args) {
        UserPreferenceDetails upd = new UserPreferenceDetails();
        new UserPreferenceDetails(0,"",0);
        new UserPreferenceDetails(0,"");
    }
}
