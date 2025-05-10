public class program10_bitwise_operator {
    public static void main(String []arg){
        int p=6,q=4;
        System.out.println("Value of p is : "+p);
        System.out.println("Value of q is : "+q);
        System.out.println("Bitwise and is : "+(p&q));
        System.out.println("Bitwise or is : "+(p|q));
        System.out.println("Bitwise xor is : "+(p^q));
        System.out.println("Bitwise not is : "+(~p));
        System.out.println("Left Shift value of p=6 1-time : "+(p<<1));
        System.out.println("Right Shift value of q=4 1-time : "+(q>>1));
    }
}
