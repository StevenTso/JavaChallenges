// quickSort1.java
// demonstrates simple version of quick sort
// to run this program: C>java QuickSort1App
////////////////////////////////////////////////////////////////
class QuickSort
   {
   private long[] theArray;          // ref to array theArray
   private int nElems;               // number of data items
//--------------------------------------------------------------
   public QuickSort(int max)          // constructor
      {
      theArray = new long[max];      // create the array
      nElems = 0;                    // no items yet
      }
//--------------------------------------------------------------
   public void insert(long value)    // put element into array
      {
      theArray[nElems] = value;      // insert it
      nElems++;                      // increment size
      }
//--------------------------------------------------------------
   
   public void display() {
      for(int j=0; j<nElems; j++) {
         System.out.print(theArray[j] + " ");
      }
   }

   public void quickSort() {
      recQuickSort(0, nElems-1);
      }
   
   public void recQuickSort(int left, int right) {
      if(right-left <= 0)
          return; 
      else {
         long pivot = theArray[right];
         int partition = partitionIt(left, right, pivot);
         recQuickSort(left, partition-1); 
         recQuickSort(partition+1, right);    
         }
      }
   
   
    public int partitionIt(int left, int right, long pivot)
       {
       int leftPtr = left-1;           // left    (after ++)
       int rightPtr = right;           // right-1 (after --)
       while(true)
          {                            // find bigger item
          while( theArray[++leftPtr] < pivot )
             ;  // (nop)
                                       // find smaller item
          while(rightPtr > 0 && theArray[--rightPtr] > pivot)
             ;  // (nop)

          if(leftPtr >= rightPtr)      // if pointers cross,
             break;                    //    partition done
          else                         // not crossed, so
             swap(leftPtr, rightPtr);  //    swap elements
          }  // end while(true)
       swap(leftPtr, right);           // restore pivot
       return leftPtr;                 // return pivot location
       }

    public void swap(int dex1, int dex2) {
      long temp = theArray[dex1];
      theArray[dex1] = theArray[dex2];
      theArray[dex2] = temp; 
      }

   } 