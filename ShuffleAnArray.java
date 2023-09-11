import java.util.Arrays;
import java.util.Random;

public class ShuffleAnArray {
    public static void main(String[] args) {
        System.out.println("This is a program to shuffle an array in java.");
        System.out.println("There are several methods to shuffle an array in java but we will be using Random class .");
        Random random = new Random();
        int [] array = {1,2,3,4,5,6,7,8,9,0};
        for (int i = 0;i<array.length;i++){
            int randomIndexToSwap = random.nextInt(array.length);
            int temp = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
