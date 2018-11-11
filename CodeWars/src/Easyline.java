import java.math.BigInteger;
import java.util.ArrayList;

public class Easyline {

	public static BigInteger easyLine(int n) {

		ArrayList<BigInteger> temp = new ArrayList<BigInteger>();
		BigInteger sumFinal = BigInteger.valueOf(0);
		BigInteger sum = BigInteger.valueOf(0);
		
		for (int i = 0; i < n + 1; i++) {
			BigInteger number = BigInteger.valueOf(1);
			for (int j = 0; j <= i; j++) {
				
				sum = sum.add(number.multiply(number));

				number = (number.multiply(BigInteger.valueOf(i-j)).divide(BigInteger.valueOf(j+1)));
			}
			temp.add(sum);
			 sum = BigInteger.valueOf(0);

		}
		sumFinal = temp.get(n);
		return sumFinal;
		}

	public static void main(String args[]) {
		BigInteger add1 = BigInteger.valueOf(0);
		add1= easyLine(50);
		 System.out.println(add1);
	}

}
