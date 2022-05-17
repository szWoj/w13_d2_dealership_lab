package Owners;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    @Before
    public void before(){
        dealership = new Dealership("CodeClan", 100);
    }

    @Test
    public void hasMoneyInTill(){
        assertEquals(100, dealership.getTill());
    }
}
