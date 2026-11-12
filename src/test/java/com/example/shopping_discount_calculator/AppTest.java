
package com.example.shopping_discount_calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App app = new App();

    @Test
    public void test10Percent() {
        assertEquals(900, app.calculateDiscount(1000, 10), 0.01);
    }

    @Test
    public void test20Percent() {
        assertEquals(800, app.calculateDiscount(1000, 20), 0.01);
    }

    @Test
    public void testZeroDiscount() {
        assertEquals(1000, app.calculateDiscount(1000, 0), 0.01);
    }

    @Test
    public void testFullDiscount() {
        assertEquals(0, app.calculateDiscount(1000, 100), 0.01);
    }

    @Test
    public void testInvalidDiscount() {
        assertThrows(IllegalArgumentException.class,
            () -> app.calculateDiscount(1000, 120));
    }

    @Test
    public void testZeroAmount() {
        assertEquals(0, app.calculateDiscount(0, 10), 0.01);
    }
}
