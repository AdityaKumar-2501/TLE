import java.util.*;

public class DoremysPaint3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] nums = new int[n];

      Map<Integer, Integer> mp = new HashMap<>();

      for (int i = 0; i < n; i++) {
        nums[i] = sc.nextInt();
        mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
      }

      if (mp.size() > 2) {
        System.out.println("No");
      }
      else if(mp.size() == 1){
        System.out.println("Yes");
      }
      else{
        int diff = 0;
        for(Map.Entry<Integer, Integer> it: mp.entrySet()){
          if(diff == 0){
            diff = it.getValue();
          }
          else{
            diff = Math.abs(diff - it.getValue());
          }
        }
        if(diff <= 1){
          System.out.println("Yes");
        }
        else{
          System.out.println("No");
        }
      }




    }

    sc.close();
  }
}