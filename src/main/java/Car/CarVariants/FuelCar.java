package Car.CarVariants;

import Car.Components.Engine;
import Car.Components.Tyres;

public class FuelCar extends Car{

    private double milesPerGallon;

    public FuelCar(Engine engine, Tyres tyres, int price, String colour, double milesPerGallon) {
        super(engine, tyres, price, colour);
        this.milesPerGallon = milesPerGallon;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }
}
