import java.util.ArrayList;

public class CountMultiples {
    
    public static void countSpecMult(long n, long mxval) {
         
    	ArrayList<Long> num2 = new ArrayList<Long>();
    	ArrayList<Long> num1 = new ArrayList<Long>();
    	int p=1;
    	while(p<=n)
    	{
    		int i=2;
    		while(i>0)
    		{
    			
    		}
    	}
    	long i =1;
    	while(i <= mxval)
    	{
    		num1=PrimeFactors(i);
    		
    	}
    	
    }
    
    public static ArrayList<Long> PrimeFactors(long n)
    {
    	ArrayList<Long> num = new ArrayList<Long>();
    	long n1=n;
    	for(long i =2;i<=n1;i++)
    	{
    		if(n1 % i==0)
    		{
    			num.add(i);
    			n1=n1/i;
    			i--;
    		}
    	}
    	return num;
    }
    
    
    
}