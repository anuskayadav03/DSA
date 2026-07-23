import java.util.Arrays;

public class sortArrayBuiltIn {
    public static void main(String[] args) {
      int[] num ={92,44,90,11,22,40};
      Arrays.sort(num);
      for(int i=0;i<num.length;i++){
          System.out.print(num[i] +" ");
      }
    }
}
