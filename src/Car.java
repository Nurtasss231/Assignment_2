public class Car extends Vehicle implements Servicable {

    private int numberOfDoors;

    public Car(String model, int year, double basePrice, int numberOfDoors) {
        super(model, year, basePrice);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be positive");
        }
        this.numberOfDoors = numberOfDoors;
    }

    public double calculateInsuranceFee() {
        int age = getAge(2025);
        return basePrice * 0.05 + age * 100;
    }

    public void performService() {
        System.out.println("Car ID " + id + ": Oil change and basic inspection performed.");
    }

    public int getServiceIntervalKm() {
        return 15000;
    }

    public String toString() {
        return "Car → " + super.toString() +
                ", Doors: " + numberOfDoors;
    }
}
