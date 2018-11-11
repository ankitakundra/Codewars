import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class DoubleLinear {

	public static int dblLinear(int n) {
		int u =1;
	     SortedSet set = new TreeSet();
	   ArrayList<Integer> num =new ArrayList<Integer>();
	    set.add(u);
	    num.add(u);
	    int i =0;
	    while(i < (n))
	    {
	    int p = (2 * u)+1;
	    int q = (3 * u)+1;
	   
	    set.add(p);
	    set.add(q);
	    
	    System.out.println(set);
	   // if(!num.contains(p))
	        // num.add(p);
	   // if(!num.contains(q))
	        // num.add(q);
	 
	    
	        u = p;
	        int p1 = (2 * u)+1;
		    int q1 = (3 * u)+1;
		   
		    set.add(p1);
		    set.add(q1);
		    
		    System.out.println(set);
		    u = q;
		    u = p;
	        int p2 = (2 * u)+1;
		    int q2 = (3 * u)+1;
		   
		    set.add(p2);
		    set.add(q2);
		   
		    System.out.println(set);
		    i++; 
		    u = p2;
		    
	 
	    }
	        
	    System.out.println(set);
	    Iterator<Integer> it = set.iterator();
	int count = 0;
	Integer current = null;
	while(it.hasNext() && count <= n) {
	   current = it.next();
	   count++;
	}
	    return(current);
	    
	}	public static void main(String args[])
	{
		int n1=10;
		int d = dblLinear(n1);
		System.out.println(d);
	}
}
