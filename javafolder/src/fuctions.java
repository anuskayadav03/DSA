import java.util.Scanner;

public class fuctions {
   /* public static void MyName(String name){
        System.out.print("your name is : " +name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        MyName(name);
        }
       }
       */

    //SUM OF TWO NUMBERS
public static int CalculateSum(int a , int b){
    int sum = (a+b);
    return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
       int sum = CalculateSum(a,b);
        System.out.println("The sum is: "+sum);
    }
}


//MULTIPLY 2 NUMBER AND RETURN PRODUCT

