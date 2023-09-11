import java.util.Arrays;
import java.util.Random;

public class GeneratingRandomNumbers {
    public static void main(String[] args) {
        System.out.println("This is a program to generate 100000 random numbers in java and storing it in an array.");
        Random random = new Random();
        int [] array = new int[100000];
        for (int i =0;i<array.length;i++){
            array[i] = random.nextInt(1000000);
        }
        System.out.println("Now we will be using bubble sort to sort this array of random numbers in ascending order.");
        boolean b = true;
        while(b){
            b = false;
            for (int i = 0;i<array.length-1;i++){
                if (array[i]>array[i+1]){
                    // swapping the two elements
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    b = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
