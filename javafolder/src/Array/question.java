import java.util.Arrays;

public class question {
    public static void main(String[] args) {
        //multiply odd indexed elements by 2 and add 10 even indexed  elements
        int[] num = {10, 20, 3, 5, 7, 99, 20};
        print(num);
    }

    public static void print(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if(i%2!=0){
                num[i]=num[i]*2;
            }
            else {
                num[i]=num[i]+10;
            }
            System.out.print(num[i] +" ");
        }
    }
}
