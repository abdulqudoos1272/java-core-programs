import java.util.Scanner;
public class program4_if_else_statemnt {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int Age;
        System.out.println("Enter Your Age : ");
        Age=sc.nextInt();
        if(Age>=18 && Age<125){
            System.out.println("You Are Eligible For Vote");
        }
        else{
            if(Age>125){
                System.out.println("Please Enter Correct Age");
            }
            else{
                System.out.println("Sorry! You are not Eligible for Vote");
            }
        }
    }
}
