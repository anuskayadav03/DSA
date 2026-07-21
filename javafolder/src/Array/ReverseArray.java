public class ReverseArray {
    public static void main(String[] args) {
        int[] num = {5, 8, 2, 6, 9};
//        int i=0,j=num.length-1;
//                while (i<j){
//                     int temp = num[i];
//                     num[i] = num[j];
//                     num[j] = temp;
//                     i++;
//                     j--;
//
//                }
//                for(int element:num){
//                    System.out.print(element +" ");
//                }

        //second approach
        int n = num.length;
        for(int i=0;i<n/2;i++){
            int temp = num[i];
            num[i] = num[n-1-i];
            num[n-1-i] = temp;

        }
        for(int element:num){
            System.out.print(element +" ");
                }
    }
}


