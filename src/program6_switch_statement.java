import java.util.Scanner;

public class program6_switch_statement {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        double Num1,Num2;
        char op;
        System.out.println("Enter Value 1 : ");
        Num1=sc.nextDouble();
        System.out.println("Enter Value 2 : ");
        Num2=sc.nextDouble();
        System.out.println();
        System.out.println("Selecct The Operation ' + ' , ' - ' , ' * ' , ' / '");
        op=sc.next().charAt(0);
        switch (op){
            case '+'->{
                System.out.println("Sum of Two Number is : "+(Num1+Num2));
            }
            case '-'->{
                System.out.println("Sub of Two Number is : "+(Num1-Num2));
            }
            case '*'->{
                System.out.println("Multiplication of Two Number is : "+(Num1*Num2));
            }
            case '/'->{
                if(Num1!=0 && Num2!=0) {
                    System.out.println("Division of Two Number is : " + (Num1 / Num2));
                }
                else{
                    System.out.println("Either Number1 or Number2 is Zero");
                }
            }
            default -> {
                System.out.println("Choose Correct Operation");
            }
        }
    }
}
