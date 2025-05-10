public class program13_do_while_loop {
    public static void main(String []arg){
        System.out.println("Do While Loop"); //Use when condition may be incorrect And run atlest one time.
        System.out.println("Print Sum of First ten Natural number");
        int i=0,sum=0;
        do{
            sum+=i;
            i++;
        }
        while (i<=10);
        System.out.println("Sum of First Ten Natural number is "+sum);
    }
}
