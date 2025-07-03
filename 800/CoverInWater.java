import java.util.*;

public class CoverInWater {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      String str = sc.next();
      int ans = 0;
      int consecutiveEmptyCell = 0;

      for (int i = 0; i < n; i++) {
        if (str.charAt(i) == '.') {
          consecutiveEmptyCell++;
          if(consecutiveEmptyCell == 3){
            ans = 2;
            break;
          }
        } else {
          ans += consecutiveEmptyCell;
          consecutiveEmptyCell = 0;
        }
      }

      if (consecutiveEmptyCell < 3) {
        ans += consecutiveEmptyCell;
      } else {
        ans = 2;
      }

      System.out.println(ans);

    }

    sc.close();
  }
}