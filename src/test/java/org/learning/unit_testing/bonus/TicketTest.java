package org.learning.unit_testing.bonus;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    public void basePrice() {
        Ticket ticket = new Ticket(18, 100);
        BigDecimal expected = BigDecimal.valueOf(100 * 0.21).setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(expected, ticket.calculatePrice());
    }

    @Test
    public void juniorDiscount() {
        Ticket ticket = new Ticket(5, 100);
        BigDecimal expected = BigDecimal.valueOf(100 * 0.21 * 0.8).setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(expected, ticket.calculatePrice());
    }

    @Test
    public void seniorDiscount() {
        Ticket ticket = new Ticket(65, 100);
        BigDecimal expected = BigDecimal.valueOf(100 * 0.21 * 0.6).setScale(2, RoundingMode.HALF_EVEN);
        assertEquals(expected, ticket.calculatePrice());
    }


    @Test
    public void negativeDistance() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(-100, 50));
    }

    @Test
    public void negativeAge() {
        assertThrows(IllegalArgumentException.class, () -> new Ticket(100, -1));
    }
}