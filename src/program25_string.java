public class program25_string {
    public static void main(String []arg){
        String info="Name : Abdul Qudoos";
        System.out.println(info);
        info=info+", Gender: Male"; // Use commConcatenation
        System.out.println(info);
        System.out.println("Length of String is : "+info.length()); //Find Length of String
        System.out.println("Char at index 4 : "+info.charAt(4));    //Get char at index 4
        //Compare the Strings
        String string1="Hello",string2="World";
        if((string1.compareTo(string2))>0){
            System.out.println("String 1 is greater");
        }
        else if((string1.compareTo(string2))<0){
            System.out.println("String 2 is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
