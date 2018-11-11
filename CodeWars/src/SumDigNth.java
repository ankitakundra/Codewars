import java.util.ArrayList;

public class SumDigNth {

	public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {
    	
    	ArrayList<Long> num = new ArrayList<Long>();
    	long u = initval;
    	num.add(u);
    	int p=0;
    	for(int z=1;z<nthterm;z++)
    	{
    		long s= u+patternl[p];
    		num.add(s);
    		p++;
    		u=s;
    		if(p==(patternl.length))
    		{
    			p=0;
    		}
    	}
    	long n= num.get(num.size()-1);
    	long sum=0;
    	while(n>0)
    	{
    		long d=n%10;
    		sum=sum+d;
    		n=n/10;
    	}
    	return sum;
    	
       
    }

	public static void main(String args[]) {
		long sum1=sumDigNthTerm(10, new long[] {2, 1, 3}, 157);
		System.out.println(sum1);
	}
}