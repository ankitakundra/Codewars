
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Josephus {
	public static <T> List<T> josephusPermutation(final List<T> items,
			final int k) {

		List<T> check = new LinkedList<T>(items);
		//System.out.println(check);
		if (check.size() == 0) {
			
			return Collections.emptyList() ;
		}
		List<T> itemsFinal = new ArrayList<T>();
		int i = k - 1;
		int j = 0;
		while (!check.isEmpty()) {

			int cnt = j + i;
			while(cnt >= check.size()) {

				cnt = (cnt) - check.size();
			}
			if (check.size() == 1) {
				itemsFinal.add(check.get(0));
				break;
			}
			if (check.size() == 2) {
				if (cnt % 2 == 0) {
					itemsFinal.add(check.get(1));
					itemsFinal.add(check.get(0));
				} else {
					itemsFinal.add(check.get(0));
					itemsFinal.add(check.get(1));
				}
				check.clear();
				break;
			}
			System.out.println(cnt);
			Object each = check.get(cnt);
			//System.out.println(each);
			itemsFinal.add((T) each);
			check.remove(cnt);
			System.out.println(check);
			j = cnt;

		}
		return itemsFinal;
	}

	public static void main(String[] args) {

		final Object[] items = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
		System.out.println(josephusPermutation(Arrays.asList(items), 11));
	}

}