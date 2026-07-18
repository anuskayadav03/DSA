public class Main {

    public static void main(String[] args){

        System.out.println(" i like pizza");
        System.out.println("it is really good");
        //this is my first java code

        //creating data types in java
        int age=20;
        int year=2026;
        System.out.println("the year is : " +year);
        System.out.println(age);

        float cgpa=8.95f;
        System.out.println("my cgpa is : " +cgpa);

        char grade ='A';
        System.out.println("my GRADE IS :" +grade);

        boolean isStudent=true;
        if(isStudent){
            System.out.println("you are a student");
        }
        //reference
        //strings
        String name="my name is anuska,nice to meet you";
        System.out.println(name);
        System.out.println("hello " +name);

        String food= "I LOVE PIZZA, WHAT ABOUT YOU ?";
        System.out.println(food);

        System.out.println("hello " + name + " " + food);

        if (isStudent){
            System.out.println("you are a student " + name);
        }
        else {
            System.out.println("you are not a student " + name);
        }

    }
}