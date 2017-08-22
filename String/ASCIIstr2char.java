package String;

class ASCIIstr2char{

    public static void main(String[] arg){
        //character ASCII value
        char c='a';
        int i=c;
        System.out.println(i);
        String s = "Hello world";
        for(int j=0;j<s.length();j++){
            int t = s.charAt(j);
            System.out.print(t+" ");
        }
    }
}