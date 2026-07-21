public class linearSearch {
    public static void main(String[] args) {

       int[] num = {1,3,90,40,70,22,34};
       int target=22;
       Boolean flag=false;
       for(int i=0;i<num.length;i++) {
           if (num[i] == target) {
               flag = true;
               break;
           }
       }
           if(flag){
               System.out.println("target exists");
           }
           else{
               System.out.println("target not exists");
           }
       }
    }

