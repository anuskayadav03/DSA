public class twoSum {
    public static void main(String[] args){

        int[] num={1,3,90,29,4};
        int sum=7;
        boolean found=false;
        for(int i=0;i<num.length;i++){
                for (int j=i+1;j<num.length;j++) {
                    if (num[i] + num[j] == sum) {
                        System.out.println(num[i] + ", " + num[j]);
                        found=true;
                        break;
                    }
                    }
                if (found) break;
                }
                if(!found){
                    System.out.println("not found any number");
                }
        }
    }

