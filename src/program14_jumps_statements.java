public class program14_jumps_statements {
    public static void main(String []arg){
        System.out.println("Break Statement"); //Use when specific condition are occur and you cannot continue further work.
        System.out.println("Print value of i and break if i greater than 10");
        for(int i=1;i<=2000;i++){
            if(i>10){
                break;
            }
            System.out.println("i = "+i);
        }
        System.out.println();
        System.out.println("Continue Statement"); //Use when specific condition are occur and you want to skip some work until condition change.
        System.out.println("Skip even number from 1 to 20");
        for (int i=1;i<=20;i++){
            if(i%2==0){
                continue;
            }
            System.out.println("i = "+i);
        }
    }
}
