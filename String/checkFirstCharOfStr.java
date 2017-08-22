package String;

public class checkFirstCharOfStr {
 
    public static void main(String[] args) {
        String str = "helloo777"; 
        Boolean flag1 = str.substring(0, 1).matches("[0-9]"); 
        //[0-9] Regular expression to match the number between 0-9.
        //we can also use \\d to to check every digit
        if(flag1){
            System.out.println("First Character is a number..!");
        }else{
           System.out.println("First character is not a number..!");
        }
    }
}