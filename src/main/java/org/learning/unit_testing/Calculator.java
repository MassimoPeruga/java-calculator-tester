package org.learning.unit_testing;

public interface Calculator {
    static float add(float num1, float num2) {
        return num1 + num2;
    }

    static float subtract(float num1, float num2) {
        return num1 - num2;
    }

    static float divide(float num1, float num2) throws IllegalArgumentException {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Divisione per zero non è permessa");
        }
    }

    static float multiply(float num1, float num2) {
        return num1 * num2;
    }
}