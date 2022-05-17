package Car.CarVariants;

import Car.Components.Engine;
import Car.Components.Tyres;

public class ElectricCar extends Car{

    private int batteryLife;

    public ElectricCar(Engine engine, Tyres tyres, int price, String colour, int batteryLife) {
        super(engine, tyres, price, colour);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}
