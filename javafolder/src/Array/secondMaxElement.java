public class secondMaxElement {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int[] arr = {1, 2, 4, 90, 60, 50};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                //second max element
            }
        }
            for ( int i = 0; i < arr.length; i++) {
                if (arr[i] > secondMax && arr[i] != max) {
                    secondMax = arr[i];
                }
            }
                System.out.println("max element is : " + max);
                System.out.println("second max element is : " + secondMax);
            }
        }



