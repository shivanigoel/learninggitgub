package Test.TESTID;

public class split {

	public static void main(String[] args) {
		String s="hello moto";
		String s2="";
		String s3="";
		
		String[] ch=s.split("\\s");
		System.out.println(ch.length);
		for (int i=0;i<ch.length;i++){
			
		System.out.println(ch[i]);
		
		
		}
		s2=s2+ch[0];
		s3=s3+ch[1];
		
		char c1=s2.toUpperCase().charAt(0);
		String new1=""+c1;
		char c2=s3.toUpperCase().charAt(0);
		String new2=""+c2;
		
		for (int i=1;i<s2.length();i++){
			new1=new1+s2.charAt(i);
		}
		
		System.out.println(new1);
		
	
	for (int i=1;i<s3.length();i++){
		new2=new2+s3.charAt(i);
	}
	
	System.out.println(new2);
	System.out.println(new1 + " " + new2);
	}
	}


