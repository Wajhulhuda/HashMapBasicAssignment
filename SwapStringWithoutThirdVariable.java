package hashmapoctober13;

public class SwapStringWithoutThirdVariable {
	
	public static void main(String []args) {
		String str1 = "hello";
		String str2 = "world";
		System.out.println("Before swaping : Str1 = "+str1+" , "+" Str2 = "+str2);
		
		str1 = str1 + str2;
		//System.out.println("Str1 = "+str1);
		
		str2 = str1.substring(0,str1.length()-str2.length());
		//System.out.println("Str2 = "+str2);
		
		
		str1 = str1.substring(str2.length());
		//System.out.println("Str1 = "+str1);
		
		System.out.println("After swaping : Str1 = "+str1+" , "+" Str2 = "+str2);
		
		
		
		
	}

}
