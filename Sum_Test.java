import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Sum_Test {
    @Test
    public void TestCase001() {
        SumCal base = new SumCal();
        double expectation = 1.7187719275874787770135214520444;
        double result = base.calculation(3, 0);
        assertEquals(expectation, result, 1);
    }

    @Test
    public void TestCase002() {
        SumCal base = new SumCal();
        double expectation = 1.8205642030260802643794210547055;
        double result = base.calculation(3, 1);
        assertEquals(expectation, result, 1);
    }

    @Test
    public void TestCase003() {
        SumCal base = new SumCal();
        double expectation = 1.9036539387158784898961472881191;
        double result = base.calculation(3, 2);
        assertEquals(expectation, result, 1);
    }

    @Test
    public void TestCase004() {
        SumCal base = new SumCal();
        double expectation = 1.9743504858348198426728361724085;
        double result = base.calculation(3, 3);
        assertEquals(expectation, result, 1);
    }

    @Test
    public void TestCase005() {
        SumCal base = new SumCal();
        double expectation = 2.0361680046403980173608741641453;
        double result = base.calculation(3, 4);
        assertEquals(expectation, result, 1);
    }

    @Test
    public void TestCase006() {
        SumCal base = new SumCal();
        double expectation = 2.091279105182546461305970582441;
        double result = base.calculation(3, 5);
        assertEquals(expectation, result, 1);
    }

    @Test
    public void TestCase007() {
        SumCal base = new SumCal();
        double expectation = 1.5848931924611134852021013733915;
        double result = base.calculation(0, 2);
        assertEquals(expectation, result, 1);
    }

    @Test
    public void TestCase008() {
        SumCal base = new SumCal();
        double expectation = 1.7187719275874787770135214520444;
        double result = base.calculation(1, 2);
        assertEquals(expectation, result, 0);
    }

    @Test
    public void TestCase009() {
        SumCal base = new SumCal();
        double expectation = 1.8205642030260802643794210547055;
        double result = base.calculation(2, 2);
        assertEquals(expectation, result, 0);
    }

    @Test
    public void TestCase010() {
        SumCal base = new SumCal();
        double expectation = 1.9743504858348198426728361724085;
        double result = base.calculation(4, 2);
        assertEquals(expectation, result, 1);
    }

    @Test
    public void TestCase011() {
        SumCal base = new SumCal();
        double expectation = 2.0361680046403980173608741641453;
        double result = base.calculation(5, 2);
        assertEquals(expectation, result, 1);
    }

    @Test
    public void TestCase012() {
        SumCal base = new SumCal();
        double expectation = 2.091279105182546461305970582441;
        double result = base.calculation(6, 2);
        assertEquals(expectation, result, 1);
    }

    @Test
    public void TestCase013() {
        SumCal base = new SumCal();
        double expectation = 1.9036539387158784898961472881191;
        double result = base.calculation(3, 2);
        assertEquals(expectation, result, 1);
    }
}