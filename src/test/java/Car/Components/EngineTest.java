package Car.Components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("B200", 150);
    }

    @Test
    public void engineHasCode(){
        assertEquals("B200", engine.getEngineCode());
    }

    @Test
    public void engineHasBhp(){
        assertEquals(150, engine.getBhp());
    }
}
