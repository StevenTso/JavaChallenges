import java.util.Random;

/*
 * Write an algorithm such that if an element in an MxN matrix is 0,
 * its entire row and column are set to zero
 */
public class SetZero {
	public static void main(String[] args) {
		int n = 10;
		//Create a random array of size n*n
		int array[][] = new int[n][n];
		Random rand = new Random();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
		
		//Print before array
		System.out.println("Before:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		//Flag stuff
		boolean row[] = new boolean[n];
		boolean column[] = new boolean[n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(array[i][j] == 0) {
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		//Set stuff
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(row[i] || column[j])
					array[i][j] = 0;
			}
		}
		
		//Print after array
		System.out.println("After:");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
