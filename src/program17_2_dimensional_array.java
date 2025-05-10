import java.util.Scanner;

public class program17_2_dimensional_array {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Find Sum of Two Matrix");
        int [][]matrix1=new int[3][3];
        int [][]matrix2=new int[3][3];
        System.out.println("Enter Matrix One Element");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter Matrix Two Element");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix One is ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix1[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Matrix Two is ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matrix2[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("Sum of Two Matrix is ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print((matrix1[i][j])+(matrix2[i][j])+"  ");
            }
            System.out.println();
        }
    }
}
