import java.util.Scanner;
public class program24_fibnoci_using_recursion{
    public static int fibo(int n)
    {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }    public static void main(String []arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much time you want to print Fibonaci Series");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibo(i)+"   ");
        }
    }
}
