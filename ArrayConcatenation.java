import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        // program to concatenate two arrays
        System.out.println("This is a program to concatenate two arrays in Java.");
        int[] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] concatenatedArray = new int[arr2.length+arr1.length];
        for (int i = 0;i<arr1.length;i++){
            concatenatedArray[i]=arr1[i];
        }
        for (int i = 0;i< arr2.length;i++){
            concatenatedArray[i+arr1.length]=arr2[i];
        }
        System.out.println(Arrays.toString(concatenatedArray));
    }
}
