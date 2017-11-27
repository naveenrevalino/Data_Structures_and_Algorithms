package algorithm.algo_linearsearch;

public class LinearSearch {

	public static int main(int [] a, int x) {
		for (int i=0; i<a.length; i++) {
			if(a[i] == x){	
				return i;
			}
		}
		return -1;
		

	}

}
