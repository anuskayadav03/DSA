import java.util.Arrays;
import java.util.Scanner;

public class LearnArray {
    public static void main(String[] args) {

        /*int[] num={5,6,1,90,22,34};
        //print element by index
        System.out.println("element at index 1 is : " +num[1]);
        //updating elements
        num[1]=99;
        System.out.println("updated element at index 1 is : " +num[1]);
        */

       /* int[] numbers = new int[5]; //only 5 elements can be there
        numbers[0]=20;
        numbers[1]=30;
        numbers[2]=40;
        numbers[3]=50;
        System.out.println(Arrays.toString(numbers));

        */
        //print all elements of array
       /* int[] num ={10,20,30,40,50,55,66};
        //LENGTH OF ARRAY
        System.out.println(num.length);
        for (int i=0; i<num.length;i++) {
            System.out.print(num[i] + " ");
        }
        */

        //TAKING INPUT FROM USER
        Scanner sc = new Scanner(System.in);
        int[] age = new int[4];
        for (int i = 0; i < age.length; i++) {
            age[i] = sc.nextInt();
            System.out.println(age[i]);
            //print double of age
            System.out.print(2*age[i] +" ");

        }

    }

}


