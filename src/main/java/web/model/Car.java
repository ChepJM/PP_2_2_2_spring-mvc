package web.model;

public class Car {
    private String model;
    private int maxSpeed;
    private int yearOfConstruction;

    public Car() {
    }

    public Car(String model, int maxSpeed, int yearOfConstruction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfConstruction=" + yearOfConstruction +
                '}';
    }
}
