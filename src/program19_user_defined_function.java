import java.util.Scanner;
public class program19_user_defined_function {
    public static void get_element(double []temp){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<temp.length;i++){
            System.out.println("Enter Temperature of Day : "+(i+1));
            temp[i]=sc.nextFloat();
        }
    }
    public static double averge(double []temp){
        double sum=0,avg=0;
        for(int i=0;i<temp.length;i++){
            sum+=temp[i];
        }
        avg=sum/7;
        return avg;
    }
    public static void main(String []arg){
        double []temp=new double[7];
        program19_user_defined_function.get_element(temp);
         double result=program19_user_defined_function.averge(temp);
        System.out.println("Averge of 7-Days temperature is : "+result);
    }
}
