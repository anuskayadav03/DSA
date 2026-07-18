import java.util.Scanner;

public class enhancedswitch {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the day : ");
//        String day = scanner.nextLine();

        // switch(day){
//            case "monday" -> System.out.println("today is monday");
//            case "tuesday" -> System.out.println("today is tuesday");
//            case "wednesday" -> System.out.println("today is wednesday");
//            case "thursday" -> System.out.println("today is thursday");
//            case "friday" -> System.out.println("today is friday");
//            case "saturday" -> System.out.println("today is saturday");
//            case "sunday" -> System.out.println("today is sunday");

//            case "monday","tuesday","wednesday","thursday","friday" -> System.out.println("it is a week day ");
//            case "saturday","sunday" -> System.out.println("it is a weekend");
//            default -> System.out.println("it is not a valid day ! try again.");

        //CALCULATOR
        System.out.println("enter the first number : ");
        double num1 = scanner.nextDouble();

        System.out.println("enter the operator : ");
        char operator = scanner.next().charAt(0);

        System.out.println("enter the second number :");
        double num2 = scanner.nextDouble();
 double result=0;
        switch (operator) {
            case '+' -> result = (num1 + num2);
            case '-' -> result = (num1 - num2);
            case '/' -> result = (num1 / num2);
            case '*' -> result = (num1 * num2);
            case '%' -> result = (num1 % num2);
        }
            System.out.println(result);
        scanner.close();
        }
    }




