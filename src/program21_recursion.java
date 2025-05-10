import java.util.Scanner;
public class program21_recursion {
    public static int find_sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+find_sum(n-1);
        }
    }
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for 0 to n sum");
        int n=sc.nextInt();
        int result=program21_recursion.find_sum(n);
        System.out.println("Sum is : "+result);
    }
}

