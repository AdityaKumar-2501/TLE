import java.util.*;

public class TargetPractice {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      String[] board = new String[10];
      for (int i = 0; i < 10; i++) {
        board[i] = sc.next();
      }
      int points = 0;
      for (int row = 0; row < 10; row++) {
        for (int col = 0; col < 10; col++) {
          if (board[row].charAt(col) == 'X') {
            if (row >= 4 && row <= 5 && col >= 4 && col <= 5) {
              points += 5;
            } else if (row >= 3 && row <= 6 && col >= 3 && col <= 6) {
              points += 4;
            } else if (row >= 2 && row <= 7 && col >= 2 && col <= 7) {
              points += 3;
            } else if (row >= 1 && row <= 8 && col >= 1 && col <= 8) {
              points += 2;
            } else if (row >= 0 && row <= 9 && col >= 0 && col <= 9) {
              points += 1;
            }
          }
        }
      }

      System.out.println(points);
    }

    sc.close();
  }
}