import java.util.LinkedList;

public class Josphus {
  public static void main(String[] args) {
    //Initialize
    LinkedList<Integer> LL = new LinkedList<Integer>();
    for(int i=0; i<41; i++) {
      LL.add(i);
    }
    
    int k = 3;
    
    //Making moves
    int index = 0;
    int counter = 1;
    while(LL.size() > 1) {
      if(counter%k == 0) {
        LL.remove(index);
        counter = 1;
      }
      else {
        index = (index+1)%LL.size();
        counter++;
      }
    }
    System.out.println("The last standing is: " + LL.get(0));
  }
}