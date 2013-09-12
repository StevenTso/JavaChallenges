/* Write a program that takes two integers, N and M, 
 * and find the largest integer composed of N-digits 
 * that is evenly divisible by M. N will always be 1 or greater, 
 * with M being 2 or greater. Note that some combinations of N and M 
 * will not have a solution.
 */
public class NDivDigits {
	public static void main(String[] args) {
		int a = 7;
		int b = 4241275;
		//Create upper bound;
		int ans = (int) (Math.pow(10, a)-1);
		//Reduce until correct answer
		while(ans%b!=0) ans--;
		
		System.out.println(ans);
	}
}
