import java.util.Scanner;

public class conditional {
    public static void main(String[] args){

        String name;
        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your name: ");
        name= scanner.nextLine();
        if(name.isEmpty()){
            System.out.println("enter your name first");
        }
        else {
            System.out.println("your name is " +name);
        }

        System.out.print("what is your age ? ");
        age = scanner.nextInt();
         if(age<18){
             System.out.println("you are a teenager");
         }
         else if(age>=50){
             System.out.println("you are a senior");
         } else if (age>=18) {
             System.out.println("you are a adult");

         } else{
             System.out.println("you are a not born ");
         }
         scanner.close();
         }
    }

