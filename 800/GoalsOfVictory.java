import java.util.*;

public class GoalsOfVictory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
          int n = sc.nextInt();
          int[] nums = new int[n];
          int sum = 0;
          for(int i = 0; i < n-1; i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
          }

          System.out.println(-1*sum);
        }

        sc.close();
    }
}