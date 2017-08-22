package Bit_Manipulation;
class BitOperations{
    
    public static void main(String[] args){
        
        int a=15; //0000 1111
        int b=21; //0001 0101
        
        //AND Operation
        /*
            0000 1111
          & 0001 0101
        --------------
            0000 0101
        */
        int f=(a&(a-1));
        System.out.println("Power of 2 Operation : "+f+" Binary value: "+Integer.toBinaryString(f));
        
        int and=a&b;
        System.out.println("AND Operation : "+and+" Binary value: "+Integer.toBinaryString(and));
        //OR Operation
        /*
            0000 1111
          | 0001 0101
        --------------
            0001 1111
        */
        int or=a|b;
        System.out.println("OR Operation : "+or+" Binary value: "+Integer.toBinaryString(or));
         //XOR Operation
        /*
            0000 1111
          & 0001 0101
        --------------
            0001 1010
        */
        int xor=a^b;
        System.out.println("XOR Operation : "+xor+" Binary value: "+Integer.toBinaryString(xor));
        int x=7;
        //NOT Operation
        int not=~x;
        System.out.println("NOT Operation : "+not+" Binary value: "+Integer.toBinaryString(not));

    }
}