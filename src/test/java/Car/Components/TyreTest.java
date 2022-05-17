package Car.Components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyres tyre;

    @Before
    public void before(){
        tyre = new Tyres(3, TyreSeason.SUMMER);
    }

    @Test
    public void hasWidth(){
        assertEquals(3, tyre.getWidth());
    }

    @Test
    public void hasSeason(){
        assertEquals(TyreSeason.SUMMER, tyre.getTyreSeason());
    }
}
