public class TrunPrimes {
  public static int placeVal(int num, int place) {
    int val = (int)((num % Math.pow(10, place)) / Math.pow(10, place-1));
    return val;
  }
    
  public static boolean isPrime(int val) {
	if(val==1) {
		return false;
	}
	else {
		for(int i=2; i<val; i++) {
      if(val % i == 0) {
        return false;
      }
    	}
	}
    return true;
  }
  
  public static boolean checkLeft(int val) {
    int places = (int)Math.log10(val)+1;
    int curr = val;
    for(int i=places; i>0; i--) {
      if(!isPrime(curr) || placeVal(curr, i)==0) {
        return false;
      }
      curr -= placeVal(curr, i) * Math.pow(10, i-1);
    }
    return true;
  }
  
  public static boolean checkRight(int val) {
    int places = (int)Math.log10(val)+1;
    int curr = val;
    for(int i=1; i<=places; i++) {
      if(!isPrime(curr) || placeVal(curr, 1)==0) {
        return false;
      }
      curr = (curr - placeVal(curr, 1)) / 10;
    }
    return true;
  }  
  
  public static void solver(int input) {
   int leftVal = 0;
   int rightVal = 0;
   boolean leftFlag = false;
   boolean rightFlag = false;
   int valIn = input;
   
   while(leftFlag == false || rightFlag == false) {
     //left
     if(leftFlag == false) {
       if(checkLeft(valIn)) {
         leftVal = valIn;
         leftFlag = true;
       }
     }
     //right
     if(rightFlag == false) {
       if(checkRight(valIn)) {
         rightVal = valIn;
         rightFlag = true;
       }
     }
     //clean up
     valIn--;
   }
   
   System.out.println(leftVal);
   System.out.println(rightVal);
  }
  
  public static void main(String[] args) {
    solver(1000000);
  }
}