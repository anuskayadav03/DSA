import java.util.Scanner;
public class area {
    public static void main (String[] args){

            //CALCULATE AREA OF RECTANGLE
            Scanner sr = new Scanner(System.in);
            System.out.print("enter the length of rectangle : ");
            int length = sr.nextInt();
            System.out.print("enter the width of rectangle : ");
            int width = sr.nextInt();

            int area=length*width;

            System.out.println("the area of the rectangle is : " +area);
            sr.close();

    }
}