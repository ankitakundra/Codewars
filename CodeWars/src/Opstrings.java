import java.util.function.Consumer;
import java.util.function.Function;

class Opstrings {
    
    public static String diag1Sym(String strng) {
    	
    	String[] str = strng.split("\n");
    	char[][] arr = new char[str.length][str.length];
    	System.out.println("ankita");
    	for(int i =0; i < 4;i++)
    	{
    		for(int j=0;j < 4;j++)
    		{
    			System.out.println("ankita");
    			arr[i][j]=str[j].charAt(i);
    			System.out.println(arr[i][j]);
    		}
    	}
    	
    	return "";
        
    }
    public static String rot90Clock(String strng) {
    	return "";
    	
    }
    public static String selfieAndDiag1(String strng) {
    	return "";
    }
    
    public static String oper(Function<String,String> b3, String s) {
		return s;
      
    	
    }
    public static void main(String[] args) {
		
    	System.out.println(oper(Opstrings::diag1Sym, "abcd\nefgh\nijkl\nmno"));
	}
}
