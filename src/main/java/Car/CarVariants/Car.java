package Car.CarVariants;

import Car.Components.Engine;
import Car.Components.Tyres;

public abstract class Car {

    private Engine engine;
    private Tyres tyres;
    private int price;
    private String colour;

    public Car(Engine engine, Tyres tyres, int price, String colour) {
        this.engine = engine;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }
}
