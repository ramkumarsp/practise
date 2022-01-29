package com.interview;

import java.math.BigDecimal;

public class CheckBigDecimalChanges {
    public static void main(String[] args) {
        BigDecimal zero = new BigDecimal(0);
        BigDecimal hundred = new BigDecimal(100);

        System.out.println(zero.divide(hundred));
    }
}
