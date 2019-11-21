import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    Calculator cal=new Calculator();

    public CalculatorTest(String name) {
        super(name);
    }

    public void testSum() {
        assertEquals(2,cal.sum( 1,1));
    }
    public void testSum1() {
        assertEquals(5,cal.sum( 3,2));
    }

    public void testSum2() {
        assertEquals(4,cal.sum( 3,1));
    }

}

