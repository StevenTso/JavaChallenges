public class DigitalRoot {
  
  public static int placeVal(int num, int place) {
    int val = (int)((num % Math.pow(10, place)) / Math.pow(10, place-1));
    return val;
  }
  
  public static void DR(int input) {
    int iterations = 0;
    int sum = 0;
    
    int places = (int)Math.log10(input)+1;
    for(int i=1; i<=places; i++) {
      sum+= placeVal(input, i);
    }
    iterations++;
    
    while(sum > 9) {
     int temp = sum;
     sum = 0;
     places = (int)Math.log10(temp)+1;
     for(int i=1; i<=places; i++) {
       sum += placeVal(temp, i);
     }
     iterations++;
    }
    System.out.println(input + " has additive persistence " + iterations + " and digital root of " + sum);
  }
  
  public static void main(String[] args) {
    int input = 39390;
    DR(input);
  }
}