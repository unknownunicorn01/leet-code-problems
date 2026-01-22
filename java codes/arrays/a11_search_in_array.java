import java.util.*;
class Solution{
  int search(int[] arr,int k){
    int left = 0;
    int right = arr.length-1;
    while(left <= right){
      if(arr[left] == k) return left;
      if(arr[right] == k) return right;
      left++;
      right--;
    }
    return -1;
  }
}
public class a11_search_in_array{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i] = sc.nextInt();
    }
    int k = sc.nextInt();
    Solution sl = new Solution();
    int res = sl.search(arr,k);
    System.out.println(res);
    sc.close();
  }
}