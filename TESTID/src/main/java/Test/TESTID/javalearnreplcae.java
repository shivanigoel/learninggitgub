package Test.TESTID;

public class javalearnreplcae {

	public static void main(String[] args) {
		
		
		String s="Hello";
		String s1="world";
		String c="";
		for (int i=0;i<s.length()-1;i++){
			
			char a=s.charAt(i);
			char b=s1.charAt(i);
			a=b;
			
			c=c+a;
		}
		
		System.out.println(c);
		
		

	}

}
