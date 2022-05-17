package Car.CarVariants;

import Car.Components.Engine;
import Car.Components.TyreSeason;
import Car.Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuelCarTest {

    FuelCar fuelCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("B200", 150);
        tyres = new Tyres(3, TyreSeason.SUMMER);
        fuelCar = new FuelCar(engine,tyres,1000,"Blue", 70);
    }

    @Test
    public void hasMilesPerGallon(){
        assertEquals(70, fuelCar.getMilesPerGallon(), 0.0);
    }
}
