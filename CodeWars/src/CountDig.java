import java.util.ArrayList;

public class CountDig {
    
    public static int nbDig(int n, int d) {
        
    	ArrayList<Integer> num= new ArrayList<Integer>();
    	int i =0;
    	while(i <=n)
    	{
    	num.add(i*i);
    	i++;
    	}
    	int j=0;
    	int c=0;
    	while(j < num.size())
    	{
    		int check = num.get(j);
    		while(check > 0)
    		{
    			int one = check%10;
    			if(one==d)
    				c++;
    			check=check/10;
    		}
    		check=0;
    		j++;
    	}
    	System.out.println(num);
    	return c;
  	
    }
    public static void main(String[] args) {
		
    System.out.println(nbDig(10, 0));
	}
}