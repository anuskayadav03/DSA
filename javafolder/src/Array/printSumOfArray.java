import java.util.Scanner;

public class printSumOfArray {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sr = new Scanner(System.in);

        //elements of array input from user
        int[] num = new int[4];
        System.out.print("enter elements of array ");

        for(int i =0;i<num.length;i++) {
            num[i] = sr.nextInt();
            sum += num[i];
        }
            System.out.println("The sum is " + sum);
            }
        }



