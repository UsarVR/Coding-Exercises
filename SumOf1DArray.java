import java.util.Arrays;
import java.util.Random;

public class SumOf1DArray {
    public static void main(String[] args) {
        System.out.println("This is a program to add all the elements in an array using for each loop.");
        // first we will generate 10 random numbers and store it in an array.
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("The random elements generated are : ");
        System.out.println(Arrays.toString(array));
        // adding all the elements using for each loop
        int sum = 0;
        for (int element : array) {
            sum = sum + element;
        }
        System.out.println("The sum of the 10 random numbers generated are : " + sum);
    }
}
