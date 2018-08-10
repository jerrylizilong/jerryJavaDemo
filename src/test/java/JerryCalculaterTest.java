import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class JerryCalculaterTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testAddMethod() {
        assertEquals(new JerryCalculater().addMethod(1.2,3.4),4.6);

    }

    @Test
    public void testMinusMethod() {
        assertEquals(3.4, new JerryCalculater().minusMethod(6.2,2.8));
    }

    @Test
    public void testTimesMethod() {
        assertEquals(new JerryCalculater().timesMethod(4.0,6.0),24.0);
    }

    @Test
    public void testDevideMethod() {
        new JerryCalculater().devideMethod(4.0,0.0);
        assertFalse(new JerryCalculater().calculateResult);
        new JerryCalculater().devideMethod(4.0,4.0);
        assertTrue(new JerryCalculater().calculateResult);
        assertEquals(new JerryCalculater().result,1.0);
    }


}