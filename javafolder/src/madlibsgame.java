import java.util.Scanner;

public class madlibsgame {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("enter adjective1");
        adjective1 = sc.nextLine();
        System.out.println("enter noun1");
        noun1 = sc.nextLine();
        System.out.println("enter adjective2");
        adjective2 = sc.nextLine();
        System.out.println("enter verb1");
        verb1 = sc.nextLine();
        System.out.println("enter adjective3");
        adjective3 = sc.nextLine();

        System.out.println("Today i went to a" +adjective1 +"zoo");
        System.out.println(" in dehradun , and i saw a " +noun1 +".");
        System.out.println(" It was " +adjective2 +" " +"and" +" "+verb1 + "!");
        System.out.println("i was " +adjective3 +"!");


sc.close();


    }
}
