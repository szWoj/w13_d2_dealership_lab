package Car.CarVariants;

import Car.Components.Engine;
import Car.Components.TyreSeason;
import Car.Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    Engine engine;
    Tyres tyres;
    ElectricCar electricCar;

    @Before
    public void before(){
        engine = new Engine("B200", 150);
        tyres = new Tyres(3, TyreSeason.SUMMER);
        electricCar = new ElectricCar(engine, tyres, 2000, "Blue", 100);
    }

    @Test
    public void hasBatteryLife(){
        assertEquals(100, electricCar.getBatteryLife());
    }
}
