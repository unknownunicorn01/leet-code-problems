// package arrays;
import java.util.*;
// package array;
class Solution{
  int removeDuplicate(int[] arr){
    int j=1;
    for(int i=0;i<arr.length;i++){
      if(arr)
    }
  }
}
public class arr_remove_duplicate {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    Solution obj = new Solution();
    // int[] res = obj.removeDuplicate(arr);
    // for(int i=0;i<res.length;i++){
    //   System.out.print(res[i] + " ");
    // }
    int res= obj.removeDuplicate(arr);
    System.out.println(res);
    for(int i=0;i<n;i++){
      System.out.print(arr[i] + " ");
    }
    sc.close();
  }
}