import java.util.Scanner;
public class program12_while_loop {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("While Loop"); //Use when Number of Iteration are not given.
        System.out.println("Check Number is Even or Add repeat Util user want");
        int n;
        boolean con=true;
        while (con){
            System.out.println("Enter a number : ");
            n=sc.nextInt();
            if(n%2==0){
                System.out.println("You enter even number");
            }
            else {
                System.out.println("You enter odd number");
            }
            System.out.println("Do you want to repeat this press 1 else any key");
            int d=sc.nextInt();
            if(d==1){
                con=true;
            }
            else{
                con=false;
            }
        }
    }
}
