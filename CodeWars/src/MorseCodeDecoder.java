import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {
	public static String decode(String morseCode) {

		Map<String, String> mp = new HashMap<String, String>();
		mp.put("....", "H");
		mp.put(".", "E");
		mp.put("-.--", "Y");
		mp.put(".---", "J");
		mp.put("..-", "U");
		mp.put("-..", "D");

		String finalStr ="";
		int i = 0;
		String arr[] = null;
		String array[] = morseCode.split("   ");
		while (i < array.length) {
			arr = array[i].trim().split(" ");
			int j = 0;
			while (j < arr.length) {
				if(arr[j]=="")
				{
					j++;
					continue;
				}
				finalStr = finalStr+mp.get(arr[j].trim());;
				j++;
			}
			
			finalStr=finalStr+" ";
			i++;

		}
		return finalStr.trim();

	}
	public static void main(String[] args) {
		
		System.out.println(decode(". ."));
	}
	
	
}