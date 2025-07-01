import java.util.*;

public class Halloumi {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] nums = new int[n];
            boolean isSorted = true;
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
                if (i > 0 && nums[i - 1] > nums[i]) {
                    isSorted = false;
                }
            }
            if (k == 1) {
                if (!isSorted) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("YES");
            }
        }

        sc.close();
    }
}