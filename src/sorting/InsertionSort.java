package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int myArray[] = insertionSort(new int [] {25,45,1,23,78,99,35,55,18});
		for (int i=0; i< myArray.length; i++) {
		System.out.println(myArray[i]);
		}

	}
	public static int [] insertionSort(int []a) {
		for(int i=1; i <a.length; i++) {
			int element = a[i]; //the element that we intend to bring to the sorted area.
			int j= i-1; // variable points to the index position of the last variable in the sorted area.
			while (j>=0 && a[j]>element) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = element;
		}
		return a;
	}
}
