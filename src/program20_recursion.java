import java.util.Scanner;
public class program20_recursion {
    public static int factorial(int n){
        if(n<=0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int n=sc.nextInt();
        int result=program20_recursion.factorial(n);
        System.out.println("Factorial of "+n+" is : "+result);
    }
}
