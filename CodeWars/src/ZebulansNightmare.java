public class ZebulansNightmare {
	public static String zebulansNightmare(final String functionName) {

		if (functionName.length() == 0) {
			return null;
		}
		String str="";
		for (int i = 0; i < functionName.length(); i++)

		{
			char d = functionName.charAt(i);
			 System.out.println(d);
			if (((d >= 65) && (d <= 90)) || ((d >= 97) && (d <= 122)) || ((d >= 48) && (d <= 57))) 
			
			{
             str = str+d;
             System.out.println(str);
				
			}
			else
				str = str +(d-32);
			 System.out.println(str);
		}
		return str;

	}
	
	public static void main(String args)
	{
		String str1=zebulansNightmare("abc_def");
		System.out.println(str1);
	}
	
}