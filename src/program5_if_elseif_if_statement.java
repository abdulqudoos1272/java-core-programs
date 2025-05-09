import java.util.Scanner;
public class program5_if_elseif_if_statement {
    public static void main(String []arg){
        Scanner sc=new Scanner(System.in);
        double OOPs,DSA,Web,Python,MAP;
        System.out.println("Enter Marks Of OOPs Subject out of 100 : ");
        OOPs=sc.nextDouble();
        System.out.println("Enter Marks Of DSA Subject out of 100  : ");
        DSA=sc.nextDouble();
        System.out.println("Enter Marks Of WEB Subject out of 100 : ");
        Web=sc.nextDouble();
        System.out.println("Enter Marks Of Python Subject out of 100 : ");
        Python=sc.nextDouble();
        System.out.println("Enter Marks Of MAP Subject out of 100 : ");
        MAP=sc.nextDouble();
        if(OOPs>0 && OOPs<=100 || DSA>0 && DSA<=100 && Web>0 && Web<=100 && Python>0 && Python <=100 && MAP>0 && MAP<=100){
            Double sum=OOPs+DSA+Web+Python+MAP;
            Double percentage=(sum/500)*100;
            if(percentage>=90 && percentage<=100){
                System.out.println("You Get Grade A");
            } else if (percentage>=80 && percentage<=89) {
                System.out.println("You Get Grade B");
            } else if (percentage>=70 && percentage<=79) {
                System.out.println("You Get Grade C");
            } else if (percentage>=60 && percentage<=69) {
                System.out.println("You Get Grade D");
            } else if (percentage>=50 && percentage<=59) {
                System.out.println("You Get Grade E");
            }
            else{
                System.out.println("Sorry You cannot get Marks According to Our Criteria");
            }
        }
        else{
            System.out.println("Enter Correct Marks");
        }
    }
}
