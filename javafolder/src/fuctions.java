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
/*public static int CalculateSum(int a , int b){
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
*/

//MULTIPLY 2 NUMBER AND RETURN PRODUCT
/*public static int product(int a,int b){
	int c=a*b;
	return c;
}
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=product(a,b);
    System.out.println("the product is : "+c);
}
}
 */

//FIND FACTORIAL OF A NUMBER
public static void FindFactorial(int num){
    int factorial = 1;
    if (num<0){
        System.out.println("invalid number");
        return;
    }
    for (int i =num; i>=1; i--) {
        factorial = factorial * i;
    }
    System.out.println(factorial);
    return;
}
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    FindFactorial(num);
 }
}
