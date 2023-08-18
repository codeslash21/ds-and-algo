// merge sort has better worst case time complexity than insertion sort. Merge sort can be used for external sorting. Its a stable sorting algorithm but not inplace.
// t.c.=O(nlogn), s.c.=O(n), for merge procedure.
import java.util.*;

class Main {
  public static void merge(int[] arr, int start, int mid, int end) {
    int n1=mid-start+1;
    int n2=end-mid;
    int[] left=new int[n1], right=new int[n2];
    for(int i=0;i<n1;i++)
      left[i]=arr[start+i];
    for(int i=0;i<n2;i++)
      right[i]=arr[mid+1+i];
    int k=start, i=0, j=0;
    while(i<n1 && j<n2) {
      if(left[i]<right[j])
        arr[k++]=left[i++];
      else
        arr[k++]=right[j++];
    }
    while(i<n1)
      arr[k++]=left[i++];
    while(j<n2)
      arr[k++]=right[j++];
  }

  public static void mergeSort(int[] arr, int start, int end) {
    if(start<end) { // check if the subarray has at least two elements
      int mid=start+(end-start)/2;
      mergeSort(arr, start, mid);
      mergeSort(arr, mid+1, end);
      merge(arr, start, mid, end);
    }
  }
}
