package com.learning.java.pojo;

public interface Vehicle {
    enum Make {
        ROYAL_ENFIELD,
        MARUTI,
        MAHINDRA,
        TATA,
        KIA,
        HYUNDAI,
        RENUALT,
        FORCE,
        TOYOTO,
        TVS,
        BAJAJ,
        HONDA,
        SUZUKI,
        HERO;
    }
    String move();
}
