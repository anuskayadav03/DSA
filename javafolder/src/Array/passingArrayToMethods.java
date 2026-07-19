public class passingArrayToMethods {
    public static void main(String[] args) {
       int[] x={10,30,50};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }
   // public static void change(int[] x){
       // x[2]=90;
    public static void change(int[] y){
        y[2]=-1;
    }
}
