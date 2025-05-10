import java.util.Scanner;
public class program11_for_loop {
    public static void main(String []arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For Loop"); //Use when Number of Iterations are given.
        System.out.println("Table of 8 Using For Loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println("8 x " + i + " = " + (8 * i));
        }
    }
}
