package org.learning.unit_testing.bonus;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ticket {
    private final int age;
    private final int km;
    private static final BigDecimal basePrice = new BigDecimal("0.21");
    private static final BigDecimal juniorDiscount = new BigDecimal("0.8");
    private static final BigDecimal seniorDiscount = new BigDecimal("0.6");

    public Ticket(int age, int km) throws IllegalArgumentException {
        if(age < 0 || age > 130 || km < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.age = age;
        this.km = km;
    }

    public BigDecimal calculatePrice() {
        BigDecimal finalPrice = basePrice.multiply(BigDecimal.valueOf(km));

        if(age < 18) {
            finalPrice = finalPrice.multiply(juniorDiscount);
        } else if(age >= 65) {
            finalPrice = finalPrice.multiply(seniorDiscount);
        }

        return finalPrice.setScale(2, RoundingMode.HALF_EVEN);
    }
}