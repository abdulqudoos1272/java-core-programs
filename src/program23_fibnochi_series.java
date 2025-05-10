import java.util.Scanner;
public class program23_fibnochi_series {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("How much time you want to print Fibonachi Series");
        int n=sc.nextInt();
        int  i=1,num1=0,num2=1,num3=0;
        while (i<=n){
            System.out.print(num3+"   ");
            num1=num2;
            num2=num3;
            num3=num1+num2;
            i++;
        }
    }
}
