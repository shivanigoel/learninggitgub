package Test.TESTID;

public class upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="shivani";
		String s1="";
		char ch=s.toUpperCase().charAt(0);
		System.out.println(ch);
		s1=s1+ch;
		
		for (int i=1;i<s.length();i++){
			s1=s1+s.charAt(i);
			
			
			
		}
		
		System.out.println(s1);
	}

}
