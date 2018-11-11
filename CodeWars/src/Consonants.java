public class Consonants {
	public static int getCount(String str) {

		int i = 0;
		int count = 0;
		while (i < str.length()) {
			char c = str.charAt(i);
			System.out.println(c);
			if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))
			{
				count++;
				System.out.println(count);
			}
			i++;
		}
		return str.length()-count;
	}

	public static void main(String[] args) {

		System.out.println(getCount("helLo world"));
	}
}