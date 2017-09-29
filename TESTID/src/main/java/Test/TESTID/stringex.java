package Test.TESTID;

/**
 * Hello world!
 *
 */
public class stringex 
{
    public static void main( String[] args )
    {
        //using reverse keyword
    	
    	String s1="Hello";
        StringBuilder sd=new StringBuilder();
        sd.append(s1);
        System.out.println(sd.reverse());
        	
        
       //using to char array
        char[] ch=s1.toCharArray();    
        
        for (int i=ch.length-1;i>=0;i--){
        	System.out.print(ch[i]);
        }
        //Normal using string only
        for (int i=s1.length()-1;i>=0;i--){
        	
        	System.out.print(s1.charAt(i));
        	
        }
        
        }
    }

