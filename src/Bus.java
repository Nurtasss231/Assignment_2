public class Bus extends Vehicle implements Servicable {

    private int passengerCapacity;

    public Bus(String model, int year, double basePrice, int passengerCapacity) {
        super(model, year, basePrice);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        if (passengerCapacity <= 0) {
            throw new IllegalArgumentException("Passenger capacity must be positive");
        }
        this.passengerCapacity = passengerCapacity;
    }

    public double calculateInsuranceFee() {
        int age = getAge(2025);
        return basePrice * 0.08 + age * 200;
    }

    public void performService() {
        System.out.println("Bus ID " + id + ": Full technical inspection performed.");
    }

    public int getServiceIntervalKm() {
        return 10000;
    }

    public String toString() {
        return "Bus → " + super.toString() +
                ", Capacity: " + passengerCapacity;
    }
}

