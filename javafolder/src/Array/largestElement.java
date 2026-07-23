public class largestElement {
    public static void main(String[] args) {
        int[] num = {5, 8, 2, 6, 9};
        int largest = num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }
        }
        System.out.println("the largest element is " +largest);
    }
}
