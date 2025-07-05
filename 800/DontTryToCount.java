import java.util.*;

public class DontTryToCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt(); // size of string x
      int m = sc.nextInt(); // size of string s

      String xStr = sc.next();
      String s = sc.next();

      StringBuilder x = new StringBuilder(xStr);
      boolean isFound = false;
      int cnt = 0;

      // in how many step x become the substring of s, if possible, other wise return
      // -1;
      // as the n*m <= 25 then we can check x to itself and check if it comes in s or
      // not
      // we can only add at max 5 times because n*m <= 25 and if we take n as 1 then m
      // can max got to 25 which is 5*5 means 5 times its size

      for (int i = 0; i < 6; i++) {
        if (x.toString().contains(s)) {
          System.out.println(cnt);
          isFound = true;
          break;
        }
        x.append(x);
        cnt++;
      }

      if(!isFound) System.out.println(-1);

    }

    sc.close();
  }
}