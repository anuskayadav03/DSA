public class logicaloperator {
    public static void main(String[]args){
        // AND
        //double temp = 50;

//      if(temp <=80 && temp>=0){
//            System.out.println("not normal temp ");
//        }
//        else {
//            System.out.println("normal temp ");
        //OR
        int age = 20;
        boolean isteen = true;
        if(age<=18 || age>=20){
            System.out.println("you are teenager");
        } else if (!isteen) {
            System.out.println("not a teenager");

        } else{
            System.out.println(" is a kid");
        }
    }

}
