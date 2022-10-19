import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Prime_Number_Test {
    @Test
    public void TestMinimumMinusOneCase() {
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        boolean result = basecase.Check(0);
        assertEquals(true, result);
    }

    @Test
    public void TestMinimumCase() {
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        boolean result = basecase.Check(1);
        assertEquals(true, result);
    }

    @Test
    public void TestMimimumPlusOneCase() {
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        boolean result = basecase.Check(2);
        assertEquals(false, result);
    }

    @Test
    public void TestNominal() {
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        boolean result = basecase.Check(500);
        assertEquals(true, result);
    }

    @Test
    public void TestMaximumMinusOneCase() {
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        boolean result = basecase.Check(999);
        assertEquals(true, result);
    }

    @Test
    public void TestMaximumCase() {
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        boolean result = basecase.Check(1000);
        assertEquals(true, result);
    }

    @Test
    public void TestMaximumPlusOneCase() {
        PrimeNumberCheck basecase = new PrimeNumberCheck();
        boolean result = basecase.Check(1001);
        assertEquals(true, result);
    }
}