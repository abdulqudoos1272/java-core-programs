public class program7_binary_and_unary_operator {
    public static void main(String []arg) {
        int a = 34, b = 23;
        System.out.println("Value of a is " + a + " and b is " + b);

        System.out.println("7.1) Binary Operator");
        System.out.println("Sum of a and b is : " + (a + b));
        System.out.println("Sub of a and b is : " + (a - b));
        System.out.println("MuL of a and b is : " + (a * b));
        System.out.println("Div of a and b is : " + (a / b));
        System.out.println("Modular of a and b is : " + (a % b));//Remainder

        System.out.println();
        System.out.println("7.2)  Unary Operator"); //it contain ++,--.
        System.out.println("Before Using increment operator a is : : " + a);
        System.out.println("After Using Pre-increment operator : " + (++a)); //First Add 1 then print a
        System.out.println("After Using Post-increment operator : " + (a++)); //First print a then Add 1
        System.out.println("Before Using Decrement operator : " + a);
        System.out.println("After Using Pre-Decrement operator : " + (--a)); //First Sub 1 then Print a
        System.out.println("After Using Post-Decrement operator : " + (a--)); //First print then Sub 1
    }
    }
