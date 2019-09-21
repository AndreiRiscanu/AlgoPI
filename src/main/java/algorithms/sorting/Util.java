package algorithms.sorting;

import algorithms.Constants;

public class Util {
	public static boolean compare(Integer first, Integer second, boolean reverse) {
		return reverse == true ? (first < second) : (first > second);
	}

	public static void printArray(Number[] sorted) {
		for (int i = 0; i < sorted.length; ++i) {
			System.out.print(sorted[i] + Constants.ARRAY_DELIMITER);
		}
	}
}
