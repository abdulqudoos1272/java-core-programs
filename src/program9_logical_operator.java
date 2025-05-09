public class program9_logical_operator {
    public static void main(String []arg){
        int c=45,d=34;
        System.out.println("Value of c is "+c+" and d is "+d);
        if(c>=0 && c<1000){ //Run when both condition are true
            System.out.println("C is posotive and less than 1000");
        }
        else {
            System.out.println("Either C is negative or greater than 1000");
        }
        if(c==0 || c<d){ //Run when atleast one condidtion are true
            System.out.println("Either c is equal to 0 or c<d");
        }
        else {
            System.out.println("Either c is not equal to 0 or c>d");
        }
        if(c!=0){ //Run when condition are not true
            System.out.println("c is not equal zero");
        }
        else {
            System.out.println("c is equal to zero");
        }
    }
}
