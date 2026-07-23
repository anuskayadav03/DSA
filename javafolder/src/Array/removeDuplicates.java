public class removeDuplicates {
    public static void main(String[] args) {
        int[] num = {1,2,3,44,44,66,77,66,77,99,1};
        int i=0;
            for (int j=1;j<num.length;j++) {
                if (num[j] != num[i]) {
                    num[i + 1] = num[j];
                    i++;
                    System.out.print(num[i] + " ");
                }
            }
        }
    }
