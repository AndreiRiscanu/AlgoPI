package algorithms.sorting;

/**
 * Insertion sort: Start from the second index in the array and move forward while
 * placing every number in its place by comparing it to the previous numbers in the
 * array (which are already sorted).
 * 
 * Worst case: O(n^2)
 * 
 * @author risca
 *
 * @param <T>
 */
public class InsertionSort implements ISortingAlgorithm<Integer> {

	/**
	 * Call sort() with ascending order as default.
	 * @param toSort
	 */
	@Override
	public void sort(Integer[] toSort) {
		sort(toSort, false);
	}
	
	/**
	 * Sort the items by comparing them with the previous items in the array.
	 * @param toSort
	 * @param reverse
	 */
	@Override
	public void sort(Integer[] toSort, boolean reverse) {
		Integer key;
		
		for (int i = 1; i < toSort.length; ++i) {
			key = toSort[i];
			
			// Move all the bigger numbers to the right
			int j = i - 1;
			while (j >= 0 && Util.compare(toSort[j], key, reverse)) {
				toSort[j + 1] = toSort[j];
				--j;
			}
			
			toSort[j + 1] = key;
		}
	}
}
