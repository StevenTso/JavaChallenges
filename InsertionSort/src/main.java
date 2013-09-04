
public class main {
	public static void main(String[] args) {
		int i;
		int[] arr = new int[10];
		InsertionSort ISort;
		
		for(i=9; i>0; i--) {
			arr[9-i] = i;
		}
		
		ISort = new InsertionSort(arr);
		ISort.sort();
		ISort.print();
	}
}