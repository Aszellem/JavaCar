
public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires","filter"}),
            new Car("Lada", 4000, 2020, "pink", new String[] {"tires", "keys"}),
            new Car("BMW", 50000, 2022, "white", new String[] {"tires","filter"}),
        };

        Dealership dealership = new Dealership(cars);
        System.out.println(dealership);


        // Car newCar = dealership.getCar(0);
        // newCar.setColor("blue");
        // System.out.println(newCar);

        // dealership.sell(0);
        // System.out.println(dealership);
        
    }

}