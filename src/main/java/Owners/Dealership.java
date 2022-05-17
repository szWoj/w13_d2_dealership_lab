package Owners;

import Car.CarVariants.Car;

import java.util.ArrayList;

public class Dealership extends Owners {

    private int till;

    public Dealership(String name, int till) {
        super(name);
        this.till = till;
    }

    public int getTill() {
        return till;
    }
}
