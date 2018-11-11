import java.util.ArrayList;

public class PascalTriangle {

	
	public static void main(String[] args) {
		
		//int sum=0;
		int rows = 10;
		for (int i = 0; i < rows; i++) {
			int number = 1;
			
			for (int j = 0; j <= i; j++) {
				
				System.out.println(number);
				//sum = sum+(number*number);
				
				number = number * (i - j) / (j + 1);
			}
			System.out.println();

		}
		
	
}
}