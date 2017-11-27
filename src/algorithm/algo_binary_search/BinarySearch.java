package algorithm.algo_binary_search;

public class BinarySearch {
	
	public static void main (String[] args) {
	System.out.println(binarySearch(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,151},147));	
	}

	public static int binarySearch(int[] a, int x) {
		int p =0;
		int r = a.length- 1;
		
		while (p <= r) {
			int	q= (p+r)/2;
			
			if(x < a[q]) r = q-1;
			else if(x > a[q]) p = q+1;
			
			else return q;
			}
		return -1;
		

	}

}

