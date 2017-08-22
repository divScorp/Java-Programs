package String;


class string2char{
    public static void main(String[] arg){
        char[] c;
        String s="Hello world!";
        //String st = "123456";
        int n = 1234567;
       //converting store multiple digit integer into single digit array
        String temp = Integer.toString(n);
        int[] newarray = new int[temp.length()];
        for(int i=0;i<temp.length();i++){
            newarray[i]=temp.charAt(i)-'0';
            System.out.println(newarray[i]);
        }
        System.out.print(" \n \n ");
        
        c = s.toCharArray();
        //Length of the String
        int j = c.length;
        System.out.println("The length of the string is - " + j);
        // print the each char of the string
        for(int i=0; i<j; i++){
            System.out.println(c[i]);
        }
    }            
}
