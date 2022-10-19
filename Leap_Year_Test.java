import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Leap_Year_Test {

    @Test
    public void TestMinimumMinusCase() {

        LeapYearCheck basecase = new LeapYearCheck();
        boolean result = basecase.check(1499);
        assertEquals(false, result);
    }

    @Test
    public void TestMinimumCase() {
        LeapYearCheck basecase = new LeapYearCheck();
        boolean result = basecase.check(1500);
        assertEquals(false, result);
    }

    @Test
    public void TestMinimumPlusCase() {
        LeapYearCheck basecase = new LeapYearCheck();
        boolean result = basecase.check(1501);
        assertEquals(false, result);
    }

    @Test
    public void TestNominalCase() {
        LeapYearCheck basecase = new LeapYearCheck();
        boolean result = basecase.check(2750);
        assertEquals(false, result);
    }

    @Test
    public void TestMaximumMinusCase() {
        LeapYearCheck basecase = new LeapYearCheck();
        boolean result = basecase.check(3999);
        assertEquals(false, result);
    }

    @Test
    public void TestMaximumCase() {
        LeapYearCheck basecase = new LeapYearCheck();
        boolean result = basecase.check(4000);
        assertEquals(true, result);
    }

    @Test
    public void TestMaximumPlusCase() {
        LeapYearCheck basecase = new LeapYearCheck();
        boolean result = basecase.check(4001);
        assertEquals(false, result);
    }
}