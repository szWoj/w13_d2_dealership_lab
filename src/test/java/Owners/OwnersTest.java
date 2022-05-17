package Owners;

import Car.CarVariants.FuelCar;
import Car.Components.Engine;
import Car.Components.TyreSeason;
import Car.Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OwnersTest {

    Owners owner;
    FuelCar fuelCar;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        owner = new Customer("CodeClan");
        engine = new Engine("b200", 150);
        tyres = new Tyres(3, TyreSeason.SUMMER);
        fuelCar = new FuelCar(engine, tyres, 1000, "Blue", 70);
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", owner.getName());
    }

    @Test
    public void hasOwnedList(){
        assertEquals(0, owner.getOwnedCars().size());
    }

    @Test
    public void canAddCar(){
        owner.addCar(fuelCar);
        assertEquals(1, owner.getOwnedCars().size());
    }

    @Test
    public void canRemoveCar(){
        owner.addCar(fuelCar);
        owner.removeCar(fuelCar);
        assertEquals(0, owner.getOwnedCars().size());
    }
}
