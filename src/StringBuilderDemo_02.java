
class StringBuilderDemo_02 
{ 
	static void splitString(String str) 
	{ 
		StringBuilder alpha = new StringBuilder(), 
		num = new StringBuilder(), special = new StringBuilder(); 
		
		for (int i=0; i<str.length(); i++) 
		{ 
			if (Character.isDigit(str.charAt(i))) 
				num.append(str.charAt(i)); 
			else if(Character.isAlphabetic(str.charAt(i))) 
				alpha.append(str.charAt(i)); 
			else
				special.append(str.charAt(i)); 
		} 
	
		System.out.println(alpha); 
		System.out.println(num); 
		System.out.println(special); 
	} 
	
	
	public static void main(String args[]) 
	{ 
		String str = "zjhr5356789)(7"; 
		splitString(str); 
	} 
} 
