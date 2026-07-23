public class secondMaxElement {
    public static void main(String[] args) {
    int[] num ={5, 8, 2, 6, 9};
    int largest = num[0];
    int secondLargest = num[0];
    for(int i=1;i<num.length;i++){
        if(num[i]>largest){
            largest=num[i];
        }
    }
    for(int i=0;i<num.length;i++){
        if(num[i]>secondLargest && num[i] !=largest){
            secondLargest=num[i];
        }
    }
        System.out.println("the second largest element is " +secondLargest);
    }
}
