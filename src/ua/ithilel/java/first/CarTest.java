package ua.ithilel.java.first;

public class CarTest {

    public static void main(String[] args) {

        Car firstCar = new Car();
        Car secondCar = new Car();
        Car thirdCar = new Car();

        firstCar.carBrand = "BMW";
        firstCar.carModel = "328";
        firstCar.carClass = "D-Class";
        firstCar.carType = "Sedan";
        firstCar.carColor = "Blue";

        secondCar.carBrand = "Mersedes-Benz";
        secondCar.carModel = "G-Waggon";
        secondCar.carClass = "G-Class";
        secondCar.carType = "SUV";
        secondCar.carColor = "Grey";

        thirdCar.carBrand = "Audi";
        thirdCar.carModel = "A6";
        thirdCar.carClass = "D-Class";
        thirdCar.carType = "Sedan";
        thirdCar.carColor = "Black";

        System.out.println("First Car Brand: " + firstCar.carBrand);
        System.out.println("First Car Model: " + firstCar.carModel);
        System.out.println("First Car Class: " + firstCar.carClass);
        System.out.println("First Car Type: " + firstCar.carType);
        System.out.println("First Car Color: " + firstCar.carColor);

        System.out.println();

        System.out.println("Second Car Brand: " + secondCar.carBrand);
        System.out.println("Second Car Model: " + secondCar.carModel);
        System.out.println("Second Car Class: " + secondCar.carClass);
        System.out.println("Second Car Type: " + secondCar.carType);
        System.out.println("Second Car Color: " + secondCar.carColor);

        System.out.println();

        System.out.println("Third Car Brand: " + thirdCar.carBrand);
        System.out.println("Third Car Model: " + thirdCar.carModel);
        System.out.println("Third Car Class: " + thirdCar.carClass);
        System.out.println("Third Car Type: " + thirdCar.carType);
        System.out.println("Third Car Color: " + thirdCar.carColor);
    }
}
