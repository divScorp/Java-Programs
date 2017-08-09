package interfaceExamples;

class Aa implements Bb
{    
    public int methodB(int i)
    {
        return i =+ i * i; //i = ((+ i) * i)
    }
}

abstract interface fgf{
	
}

interface Bb  
{
    int methodB(int i);
}

 
public class practice2 
{
    public static void main(String[] args)
    {
        Bb b = new Aa();
         
        System.out.println(b.methodB(2));
    }
}
