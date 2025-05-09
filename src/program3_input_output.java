import java.util.Scanner;
public class program3_input_output {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        double a,b;
        System.out.println("Enter First Number 1 : ");
        a=sc.nextDouble();
        System.out.println("Enter Second Number 2 : ");
        b=sc.nextDouble();
        System.out.println("Sum of Two Number is : "+(a+b));
        System.out.println("Sub of Two Number is : "+(a-b));
        System.out.println("Sub of Two Number is : "+(a*b));
        if(a!=0 && b!=0){
            System.out.println("Sub of Two Number is : "+(a/b));
        }
        else{
            System.out.println("Either Num1 or Num2 is Zero");
        }
    }
};
