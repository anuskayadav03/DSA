import java.util.Arrays;

public class sortArrayBuiltIn {
    public static void main(String[] args) {
        int[] num = {20,40,10,1,11,90};
        //print the array
        System.out.print("the array is :");
        print(num);
        //next line
        System.out.println();
        //print the sorted array
        Arrays.sort(num);
        System.out.print("the sorted array is :");
        print(num);
    }
    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
