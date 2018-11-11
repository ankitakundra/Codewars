import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class DoubleLinear1 {

	public static int dblLinear(int n) {
		int u =1;
		int count=0;
	     SortedSet<Integer> set = new TreeSet<Integer>();
	   ArrayList<Integer> num =new ArrayList<Integer>();
	    set.add(u);
	    num.add(u);
	    int i =0;
	    while(i < (n))
	    {
	    int p = (2 * u)+1;
	    int q = (3 * u)+1;
      count++;
	   
	    set.add(p);
	    set.add(q);
	    if(!num.contains(p))
	         num.add(p);
	    if(!num.contains(q))
	         num.add(q);
	 
	    i++;
	        u = num.get(i);
          if(count==(3*n))
          break;
	 
	    }
	    Iterator<Integer> it = set.iterator();
	int count1 = 0;
	Integer current = null;
	while(it.hasNext() && count1 <= n) {
	   current = it.next();
	   count1++;
	}
	    return(current);
	 }
   
    public static void main(String args[])
	{
		int n1=100;
		int d = dblLinear(n1);
		System.out.println(d);
	}
}