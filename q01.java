import java.lang.reflect.Array;
import java.util.Arrays;

public class q01 {
    public static void main(String[] args) {
        System.out.println("This is a program to concatenate two arrays in java .");
        int [] arr1 = {1,2,3,4};
        int [] arr2 = {7,8,9,0};
        int a1Length = arr1.length;
        int a2Length = arr2.length;
        int [] concatenatedArray = new int[a2Length+a1Length];
        System.arraycopy(arr1,0,concatenatedArray,0,a1Length);
        System.arraycopy(arr2,0,concatenatedArray,a1Length,a2Length);
        System.out.println("The concatenated array is : "+ Arrays.toString(concatenatedArray));
    }
}
