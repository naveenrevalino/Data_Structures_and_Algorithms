package sorting.mergesort;

public class MergeSort {
	public int[] sort (int actualArray[]) {
		splitSort(actualArray, 0, actualArray.length-1);
		return actualArray;
	}

	public  void splitSort(int[] actualArray, int startPosition, int endPosition) {
		if (endPosition <= startPosition) {
			return;
		}
		int midPoint = (startPosition + endPosition)/2; // to find the MIDPOINT of the given array.
		splitSort (actualArray, startPosition, midPoint); // this will split the given array into two part's, LEFT SIDE.
		splitSort (actualArray, midPoint+1, endPosition); // this will split the given array into two part's, RIGHT SIDE.
		mergeArray (actualArray, startPosition,midPoint, endPosition ); // this will combine the small chunks of array and at the same time sort them. 
		
	}

	public  void mergeArray(int[] actualArray, int startPosition, int midPoint, int endPosition) {
		
		// first step is to create a TEMP array to hold the sorted elements.
		int tempArray[] = new int [endPosition - startPosition + 1];
		
		// Index counter: for left side of the array (LS). 
		// This will point to the first slot of the left side of the array.
		int leftSlot = startPosition; 
		
		// Index counter: for right side of the array (RS).
		// This will point to the last slot of the left side of the array
		int rightSlot = midPoint+1;  
		
		// [1] [2] [3] [4] [5] [6] [7] [8] [9] -- actualArray
		// LS              MP  RS
		
		// Index counter: we will be incrementing this counter as we insert element into the array.
		int k = 0;
		
		// This while loop will check if the LS is less than or equal to the midpoint
		// Doing so we will know if the sorting with that side is over or not, same is the case with the second comparison in the while loop.
		while (leftSlot <= midPoint && rightSlot <= endPosition) {
			if (actualArray[leftSlot] < actualArray[rightSlot]) {
				tempArray[k] = actualArray[leftSlot];
				leftSlot = leftSlot + 1;
			}
			else
			{
				tempArray[k] = actualArray[rightSlot];
				rightSlot = rightSlot + 1;				
			}
			k = k+1;
		}
		if (leftSlot <= midPoint) {
			while (leftSlot <= midPoint) {
			tempArray[k] = actualArray[leftSlot];
			leftSlot = leftSlot + 1;
			k= k + 1;
			}
		} 
		else if (rightSlot <= endPosition) {
			while (rightSlot <= endPosition) {
			tempArray[k] = actualArray[rightSlot];
			rightSlot = rightSlot + 1;
			k = k + 1;
			}
		}
		
		// now we have to copy over the tempArray to the actualArray and then display it
		for (int i=0; i<tempArray.length; i++) {
			actualArray[startPosition + i] = tempArray[i];
			
		}
		
		
	}

}
