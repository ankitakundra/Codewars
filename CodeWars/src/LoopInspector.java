
public class LoopInspector{
public static void totalIncDec(int x){
  
  int num = 10 ^ x;
  int c = 0;
  int other=0;
  int count =0;
  for(int i = 11;i < 99 ; i++)
  {
	 other = i;
	  while( i > 0)
	  {
		int d = i % 10; 
		c++;
		i = i/10;  }
	  System.out.println(c);

	while(other > 0 )
	{
		int d = other  / (10 ^ (c-1));
		int e = other % 10;
		if ((d > e) || ( d== e) || (d < e))
		{
			count++;
			System.out.println(count);
		}
		other=0;
	}
	c=0;
  }
  System.out.println(count);  
}
  public static void main(String args[])
  {
	  totalIncDec(2);
	  
  }
}
