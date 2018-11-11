import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Highest2Factors {

	public static void highestBiPrimeFac(long p1, long p2, long n) {

		long n1 = p1 * p2;
		ArrayList<Long> num = new ArrayList<Long>();
		int i = 0;
		num.add(n1);
		while (n1 < n) {
			long a = n1 * 2;
			long b = n1 * 3;
			if (!num.contains(a) || (a >= n)) {
				num.add(a);
			}
			if (!num.contains(b)  || (b >= n))
			{
				num.add(b);
	}
			n1 = num.get(i);
			i++;

		}
		System.out.println(num);

	}
	

	public static void main(String[] args) {

		highestBiPrimeFac(2, 3, 50);
	}

}
