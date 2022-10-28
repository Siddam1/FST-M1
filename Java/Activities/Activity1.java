public class Activity1

{

    public static void main(String args[])
    {

        Car cellaro = new Car();
        cellaro.color = "Red";
        cellaro.transmission = "Automatic";
        cellaro.make = 2015;
        cellaro.displayCharacteristics();
        cellaro.accelerate();
        cellaro.brake();

    }

}
