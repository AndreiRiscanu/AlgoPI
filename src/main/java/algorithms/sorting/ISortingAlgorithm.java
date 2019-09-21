package algorithms.sorting;

public interface ISortingAlgorithm<T extends Number> {
	void sort(T[] toSort);
	void sort(T[] toSort, boolean reverse);
}
