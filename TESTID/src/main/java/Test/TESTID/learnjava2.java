package Test.TESTID;

public class learnjava2 {

	public static void main(String[] args) {
		/*
		int s=12345;
		String l="";
		
		for (int i=1;i<6;i++)
		{
			
			l=l+i;
			System.out.println(l);
			
			
		}
		*/
		
		String s="shivanigoel";
		String a="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			char b=s.charAt(i);
			a=a+b;
			
			
			
		}
		
		System.out.println(a);

	}

}
