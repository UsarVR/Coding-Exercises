import java.util.Random;

public class q004 {
    public static void main(String[] args) {
        System.out.println("This is a program to print out a random element from an array .");
        int[] arr = {12,23,34,45,56,67,78,89,90,1,2,3,4,5,6,7,8,9,0};
        Random random = new Random();
        int randomIndex = random.nextInt(0,arr.length); // to select a random position in the array
        System.out.println(arr[randomIndex]);
    }
}
