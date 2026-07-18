import java.util.Scanner;

public class fuctions {
    public static void MyName(String name){
        System.out.print("your name is : " +name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        MyName(name);
    }
}
