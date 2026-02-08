import java.util.*;
class Solution {
    double median(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int L = n1 + n2;
        int[] res = new int[L];
        
        int i = 0, j = 0, k = 0;

        // Merge logic with boundary checks
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) res[k++] = arr1[i++];
            else res[k++] = arr2[j++];
        }
        
        // Add remaining elements
        while (i < n1) res[k++] = arr1[i++];
        while (j < n2) res[k++] = arr2[j++];

        // Median calculation
        if (L % 2 == 1) {
            return res[L / 2];
        } else {
            return (res[L / 2 - 1] + res[L / 2]) / 2.0;
        }
    }
}

public class find_median{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr1 = new int[n];
    for(int i=0;i<n;i++){
      arr1[i] = sc.nextInt();
    }
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for(int i=0;i<n2;i++){
      arr2[i] = sc.nextInt();
    }
    Solution sol = new Solution();;
    Double an = sol.median(arr1,arr2);
    System.out.println(an);
    sc.close();
  }
}