import java.util.*;

public class JaggedSwaps {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] nums = new int[n];

      for(int i = 0 ; i < n ; i++){
        nums[i] = sc.nextInt();
      }

      if(nums[0] == 1){
        System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }

    }

    sc.close();
  }
}