import java.util.Arrays;

public class Activity2
{

    public static void main(String args[])
    {

        int[] array = {10, 77, 10, 54, -11, 10};

        System.out.println("given input" + Arrays.toString(array));

        System.out.println("Result: " + result(array));
    }

    private static boolean result(int[] array)
    {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 10) {

                sum = sum + array[i];

            }

        }

        if (sum == 30)
        {

            return true;

        }

        return false;
    }

}
