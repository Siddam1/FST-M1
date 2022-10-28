public class Activity3
{
    public static void main(String args[])
    {

        double seconds = 1000000000;
        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        System.out.println("age of Earth :"+ seconds/EarthSeconds);
        System.out.println("age of Mercury :"+ seconds/MercurySeconds/EarthSeconds);
        System.out.println("age of Venus :"+ seconds/VenusSeconds/EarthSeconds);
        System.out.println("age of Mars :"+ seconds/MarsSeconds/EarthSeconds);
        System.out.println("age of Jupiter :"+ seconds/JupiterSeconds/EarthSeconds);
        System.out.println("age of Saturn :"+ seconds/SaturnSeconds/EarthSeconds);
        System.out.println("age of Uranus :"+ seconds/UranusSeconds/EarthSeconds);
        System.out.println("age of Neptune :"+ seconds/NeptuneSeconds/EarthSeconds);

    }

}
