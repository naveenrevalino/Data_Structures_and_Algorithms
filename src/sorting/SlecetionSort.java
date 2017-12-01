package sorting;

public class SlecetionSort {

	public static void main(String[] args) {
		int [] myArray = selectionSort(new int [] {12,3,1,55,30,99,25});
		for (int i =0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
	public static int [] selectionSort(int []a) {
		for(int i=0; i<a.length; i++) {
			int minimum = i;
			for(int j= i+1; j<a.length; j++) {
				if(a[j] < a[minimum]) {
					minimum =j;
				}
			}
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum]= temp;
		}
		
		return a;
		
	}

}
