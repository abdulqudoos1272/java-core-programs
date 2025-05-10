import java.util.Scanner;
public class program22_recursion {
    public static void Print(int n){
        if(n<0){
            return;
        }
        else {
            System.out.print(n+"   ");
            Print(n - 1);
            System.out.print(n+"   ");
        }
    }
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        program22_recursion.Print(n);
    }
}