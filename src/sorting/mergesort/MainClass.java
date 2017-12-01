package sorting.mergesort;

public class MainClass {

	public static void main(String[] args) {
		int [] actualArray = {2,88,65,1,3,45,78,96,32,56};
		
		System.out.print("Actual Array: "+"[" );
		for (int i=0; i<actualArray.length; i++) {
			System.out.print(actualArray[i]+ " ");
		}
		System.out.print( "]");
		
		MergeSort newMS = new MergeSort();
		newMS.sort(actualArray);
		
		System.out.println(" ");
		System.out.print("Sorted Array: "+"[" );
		for (int i=0; i<actualArray.length; i++) {
			System.out.print(actualArray[i]+ " ");
		}
		System.out.print( "]");
		
		
	}

}
