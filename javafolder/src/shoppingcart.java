import java.util.Scanner;

public class shoppingcart {
    public static void main (String[]args){

        Scanner scanner= new Scanner(System.in);

        //item for the cart
        System.out.print("what item would you like to buy : ");
        String item=scanner.nextLine();

        //price
        System.out.print("what is the price for each? ");
        double price= scanner.nextDouble();

        //quantity
        System.out.print("how many would you like to buy : ");
        int quantity = scanner.nextInt();

        //total message with pricee
        System.out.println("you have bought " +quantity +" " +item +"s");
        System.out.println("your total price is $" +price*quantity);

        scanner.close();
    }
}
