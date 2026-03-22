package Week05.White;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountCalculatorTest {

    DiscountCalculator calc = new DiscountCalculator();

    @Test
    public void testAmountLessOrEqualZero() {
        //compare doubles with a tolerance (delta).
        assertEquals(0.0, calc.calculateDiscount(0, true), 0.001);
        assertEquals(0.0, calc.calculateDiscount(-10, false), 0.001);
    }

    @Test
    public void testMemberAbove100() {
        assertEquals(40.0, calc.calculateDiscount(200, true), 0.001);
    }

    @Test
    public void testMemberBelowOrEqual100() {
        assertEquals(10.0, calc.calculateDiscount(100, true), 0.001);
    }

    @Test
    public void testNonMemberAbove100() {
        assertEquals(20.0, calc.calculateDiscount(200, false), 0.001);
    }

    @Test
    public void testNonMemberBelowOrEqual100() {
        assertEquals(0.0, calc.calculateDiscount(100, false), 0.001);
    }

}