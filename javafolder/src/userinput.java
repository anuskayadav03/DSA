import java.util.Scanner;

public class userinput {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your name: " );
        String name = scanner.nextLine();
        System.out.println("hello " +name);

        // integar
        System.out.print("enter your age: ");
        int age = scanner.nextInt();
        System.out.println("hello my name is " +name + " ,my age is : " +age );

        //float or double
        System.out.print("enter your sgpa: ");
        float sgpa=scanner.nextFloat();

        System.out.print("enter your cgpa : ");
        double cgpa = scanner.nextDouble();

        System.out.println("your sgpa is : " +sgpa +" " +"your cgpa is : " +cgpa);

        //boolean
        System.out.print("are you a student?");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("student " +isStudent);
        if(isStudent){
            System.out.println("you are enrolled as a student  ");
        }
        else{
            System.out.println("not enrolled as a student ");
        }

        scanner.close();
    }
}
