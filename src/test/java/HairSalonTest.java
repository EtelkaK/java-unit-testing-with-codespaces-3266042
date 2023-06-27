import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class HairSalonTest {

    HairSalon hairSalon = new HairSalon();

    @Test
    public void testGetOpeningDays() {
        String[] expected = new String[] {"Monday", "Tuesday"};
        String[] actual = hairSalon.getOpeningDays();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSalonIsOpenOnMonday() {
        boolean isOpen = hairSalon.isOpen("Monday");
        assertTrue(isOpen);
    }

    @Test
    public void testSalonIsClosedOnWednesday() {
        boolean isOpen = hairSalon.isOpen("Wednesday");
        assertFalse(isOpen);
    }

    @Test
    public void testExceptionIsThrownIfWeekdayDoesNotEndInDay() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> hairSalon.isOpen("Frida"));
        String expected = "Only weekdays are valid";
        String actual = exception.getMessage();
        assertEquals(expected, actual);
    }

    @Test
    public void testApplyDiscount() {
        Calculator calculator = new Calculator();
        assumeTrue(calculator.divide(hairSalon.getHaircutPrice(), 2) == 15);
        int expected = 20;
        int actual = hairSalon.applyDiscount();
        assertEquals(expected, actual);
    }

}