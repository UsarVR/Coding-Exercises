import java.util.Scanner;

public class q002 {
    public static void main(String[] args) {
        System.out.println("This is a program to calculate the sum of all of the elements of an integer array.");
        System.out.println("Enter the length of the array : ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int [] arr = new int[length];
        for (int i = 1;i<=arr.length;i++){
            System.out.println("Enter number "+i+" : ");
            arr[i-1]= scanner.nextInt();
        }
        int sum = 0;
        for (int element : arr ){

        }
    }
}
