// t.c.=O(n) for best case, O(n^2) for worst case and avg case
// s.c.=O(1), its inplace sorting algorithm. This is also stable and online sorting algorithm
import java.util.*;

class Main {
  public static void insertionSort(int[] arr) {
    int n=arr.length;
    for(int i=1;i<n;i++) {
      int key=arr[i];
      int j=i-1;
      // place the key(arr[i]) at the correct place in its left side
      while(j>=0 && key>arr[j]) {
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=key;
    }
  }
}
