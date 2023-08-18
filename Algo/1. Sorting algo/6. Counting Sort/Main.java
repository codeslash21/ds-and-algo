// We can apply counting sort when the elements are in a particular range
// t.c.=O(n+range)=O(n) if range=O(n)
// s.c.=O(range+n), its a stable srting algorithm but not a inplace sorting algorithm.
import java.util.*;

class Main {
  public static void countingSort(int[] arr, int range) {
    int n=arr.length;
    int[] freq = new int[range+1];
    int[] sortedArr = new int[n];
    for(int i=0;i<n;i++)
      freq[arr[i]]++;
    int j=0;
    for(int i=1;i<=range;i++) {
      freq[i]+=freq[i-1];
    }
    for(int i=n-1;i>=0;i--) {
      sortedArr[freq[arr[i]-1]]=arr[i];
      freq[arr[i]]--;
    }
    for(int i=0;i<n;i++)
      arr[i]=sortedArr[i];
  }
}
