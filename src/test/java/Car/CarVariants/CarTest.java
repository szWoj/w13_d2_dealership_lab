package Car.CarVariants;

import Car.Components.Engine;
import Car.Components.TyreSeason;
import Car.Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("B200", 150);
        tyres = new Tyres(3, TyreSeason.SUMMER);
        car = new FuelCar(engine, tyres, 1000, "Blue", 70 );
    }

    @Test
    public void hasEngine(){
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void hasTyres(){
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void hasPrice(){
        assertEquals(1000, car.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("Blue", car.getColour());
    }
}
