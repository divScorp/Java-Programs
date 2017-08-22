package String;

/* to check string inputs are characters or integer */

public class checkStrChar {
    
    public static void main(String[] args){
        
        String str = "hello77";
        for(int i=0; i<str.length();i++){
            Boolean flag = Character.isDigit(str.charAt(i)); 
            if(flag){ 
               System.out.println("'"+str.charAt(i)+"' is a number");
            }
            else{
               System.out.println("'"+str.charAt(i)+"' is not a number");
            } 
        }       
    } 
}