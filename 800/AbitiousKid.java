import java.util.*;

public class AbitiousKid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    int smallestNum = Integer.MAX_VALUE;
    for(int i = 0 ; i < n ; i++){
      nums[i] = sc.nextInt();
      smallestNum = Math.min(smallestNum, Math.abs(nums[i]));
    }

    System.out.println(Math.abs(smallestNum));

    sc.close();
  }
}