// In selection sort at ith iteration we get ith min element at the correct position
// t.c.=O(n^2) for best case and worst case. In worst case when the array is sorted in ascending order there will be O(n) swaps.
// s.c.=O(1), its in-place sorting algorithm, but its not a stable sorting algorithm.
import java.util.*;

class Main {
  public static void selectionSort(int[] arr) {
    int n=arr.length;
    for(int i=0;i<n-1;i++) {
      int minIdx=i;
      for(int j=i+1;j<n;j++) {
        if(arr[j]<arr[minIdx])
          minIdx=j;
      }
      if(minIdx!=i) {
        int temp=arr[minIdx];
        arr[minIdx]=arr[i];
        arr[i]=temp;
      }
    }
  }
}
