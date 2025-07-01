import java.util.*;

public class LineTrip{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] nums = new int[n];
            int maxDiff = Integer.MIN_VALUE;
            for(int i = 0 ; i < n ; i++){
                nums[i] = sc.nextInt();
                if(i > 0)
                    maxDiff = Math.max(maxDiff,nums[i]-  nums[i-1]);
            }
            maxDiff = Math.max(maxDiff, nums[0]-0);
            maxDiff = Math.max(maxDiff, 2*(x-nums[nums.length-1]));

            System.out.println(maxDiff);
        }
        sc.close();
    }
}