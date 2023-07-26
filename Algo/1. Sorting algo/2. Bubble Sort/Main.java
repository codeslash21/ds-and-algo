// after every iteration of outer for loop we place the max element from the unsorted array to its correct position. Means after ith iteration ith max value will be at the 
// correct position
// t.c.=O(n) for best case(when array is already sorted in increasing order) and O(n^2) for worst case(when array is sorted in decreasing order)
// s.c.=O(1), its inplace algorithm
import java.util.*;

class Main {
  public static void bubbleSort(int[] arr) {
    int n=arr.length;
    for(int i=0;i<n;i++) {
      int swapped=0;
      for(int j=0;j<n-i-1;j++) {
        if(arr[j]>arr[j+1]) {
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
          swapped++;
        }
      }
      if(swapped==0)
        break;
    }
  }
}
