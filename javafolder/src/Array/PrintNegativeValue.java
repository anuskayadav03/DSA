
import java.util.Scanner;

public class PrintNegativeValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array created
        int[] arr = new int[5];
        //taking input from user
        System.out.print("Enter the elements you want to print: ");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            //print -ve elements
            for ( int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    System.out.println(arr[i] + " ");
                }
            }
    }
}

