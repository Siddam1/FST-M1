public class Car

{

    String color;
    String transmission;
    int make;
    int tyers;
    int doors;
    Car()

    {

        tyers = 4;
        doors = 4;

    }
    public void displayCharacteristics()

    {

        System.out.println("color of the car = "+ color);

        System.out.println("make of the car = "+ make);

        System.out.println("transmission of the car = "+ transmission);

        System.out.println("total no of doors on the car = "+ doors);

        System.out.println("total no of tyers of the car = "+ tyers);
    }
    public void accelerate()

    {

        System.out.println("Car is moving forward");

    }
    public void brake()

    {

        System.out.println("Car has stopped");

    }
}
