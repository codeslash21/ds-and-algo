// We can apply counting sort when the elements are in a particular range
// t.c.=O(n+range)=O(n) if range=O(n)
// s.c.=O(range)
import java.util.*;

class Main {
  public static void countingSort(int[] arr, int range) {
    int[] freq = new int[range+1];
    int n=arr.length;
    for(int i=0;i<n;i++)
      freq[arr[i]]++;
    int j=0;
    for(int i=0;i<=range;i++) {
      int cnt=freq[i];
      while(cnt>0) {
        arr[j++]=i;
        cnt--;
      }
    }
  }
}
