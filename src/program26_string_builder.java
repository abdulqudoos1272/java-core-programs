public class program26_string_builder {
    public static void main(String []arg){
        StringBuilder s1=new StringBuilder("Hello");
        System.out.println(s1);
        s1.append(" World");     //use append method instead of concatenation
        System.out.println(s1);
        s1.insert(5," :"); //use insert method
        System.out.println(s1);
        s1.setCharAt(6,'!'); //set char at index 5
        System.out.println(s1);
        System.out.println("Length of s1 is : "+s1.length()); //find length of s1
        s1.deleteCharAt(6); //delete char at index 6
        System.out.println(s1);
    }
}
