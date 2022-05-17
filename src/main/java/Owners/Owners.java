package Owners;

import Car.CarVariants.Car;

import java.util.ArrayList;

public abstract class Owners {

    private ArrayList<Car> ownedCars;
    private String name;

    public Owners(String name) {
        this.ownedCars = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public String getName() {
        return name;
    }

    public void addCar(Car car){
        ownedCars.add(car);
    }

    public void removeCar(Car car){
        int carToRemove = -1;
        for(int i = 0; i< ownedCars.size(); i++){
            if(this.ownedCars.get(i) == car){
                carToRemove = i;
            }
        }
        ownedCars.remove(carToRemove);
    }
}
