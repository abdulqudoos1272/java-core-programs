import java.util.Scanner;
public class program18_3_dimensional_array {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        int [][][]matrix3=new int[3][3][3];
        System.out.println("Enter Elements for 3-Dimensional array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    matrix3[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println("Elements of 3-Dimensional Array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    System.out.println(matrix3[i][j][k]);
                }
            }
        }
    }
}
