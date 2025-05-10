import java.util.Scanner;
public class program16_1_dimensional_array {
    public static void main(String []arg){
        System.out.println("Find Averge Temperature of 7-Days");
        Scanner sc=new Scanner(System.in);
        float []marks=new float[7];
        float sum=0,avg=0;
        for(int i=0;i<marks.length;i++){
            System.out.println("Enter Temperature of Day : "+(i+1));
            marks[i]=sc.nextFloat();
        }
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        avg=sum/7;
        System.out.println("Averge Temperature is : "+avg);
    }
}