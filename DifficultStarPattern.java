// write a java program to print out the following pattern :
//   *
//  **
// ***
//****

import java.sql.SQLOutput;
import java.util.Scanner;

public class DifficultStarPattern {
    public static void main(String[] args) {
        System.out.println("This is a program to print out the star pattern .");
        // taking input from the user :
        System.out.println("Enter the number of rows you want in the pattern :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0;i<input ;i++){
            for (int j = 0;j<input-i-1;j++){
                System.out.print(" ");
            }
            for (int k =0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
