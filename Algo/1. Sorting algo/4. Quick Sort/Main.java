// after each partition call we have the correct elemet at position q
// t.c.=O(nlogn) for best and avg case and O(n^2) for worst case(when array is sorted either in ascending or descending order)
// s.c.=O(1) its an inplace sorting algorithm
import java.util.*;

class Main {
  public static void partition(int[] arr, int start, int end) {
    int pivot=arr[start];
    int i=start;
    for(int j=start+1;j<=end;j++) {
      if(arr[j]<=pivot) {
        i++;
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
      }
    }
    int temp=arr[i];
    arr[i]=arr[p];
    arr[p]=temp;
    return i;
  }
  public static void quickSort(int[] arr, int start, int end) {
    if(start<end) {
      int q=partition(arr, start, end);
      quickSort(arr, start, q-1);
      quickSort(arr, q+1, end);
    }
  }
