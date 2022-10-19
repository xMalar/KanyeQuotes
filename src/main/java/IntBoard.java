

import java.util.Scanner;

public class IntBoard {

    public static void main(String[] args) {

        int[] board = new int[50];
        int number = 51;

      for (int i = 0; i < 50; i++)
            board[i] = number -= 1;

        System.out.println("Wpisz tu cos");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(search(board, x));

    }

    private static boolean search(int[] board, int x) {

        for (int i = 0; i < 50; i++) {
            if (board[i] == x)
                return true;
        }
    return false;

    }
}

//kontrolny koment