// In radix sort we apply counting sort on each digit of the number. 
// t.c.=O(d*(n+b)) where d is the number of digits in the max value, n=total number of elements, b=base of the number system or the range
// s.c.=O(n+b)
import java.util.*;

class Main {
  public static void countingSort(int[] arr, int exp, int range) {
    int n=arr.length;
    int[] sortedArr = new int[n];
    int[] freq = new int[range+1];
    for(int i=0;i<n;i++) {
      freq[(arr[i]/exp)%10]++;
    }
    for(int i=1;i<=range;i++)
      freq[i]+=freq[i-1];
    for(int i=n-1;i>=0;i--) {
      sortedArr[--freq[(arr[i]/exp)%10]]=arr[i];
    }
    for(int i=0;i<n;i++)
      arr[i]=sortedArr[i];
  }
  public static void radixSort(int[] arr) {
    int maxEle=arr[0];
    int n=arr.length;
    for(int i=1;i<n;i++)
      if(maxEle<arr[i])
        maxEle=arr[i];
    for(int exp=1;maxEle/exp>0;exp*=10)
      countingSort(arr, exp, 9);
  }
}
