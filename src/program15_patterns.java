public class program15_patterns {
    public static void main(String []arg){
        System.out.println("Print Pattern Using For Loop or Nested For Loop");
        System.out.println();
        System.out.println("Pattern 1");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 2");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 3");
        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                System.out.print("   ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 4");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 5");
        for(int i=5;i>=1;i--){
            for(int k=1;k<=5-i;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 6");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==5 || j==5){
                    System.out.print(" * ");
                }
                else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 7");
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+num+" ");
                num++;
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 8");
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 9");
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(" "+1+" ");
                }
                else {
                    System.out.print(" "+0+" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Pattern 10");
        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                System.out.print("   ");
            }
            for(int j=1;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
