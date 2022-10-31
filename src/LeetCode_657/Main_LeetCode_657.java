package LeetCode_657;

import java.util.Scanner;

public class Main_LeetCode_657 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input command: ");
        System.out.println(judgeCircle(scanner.nextLine()));
    }

    static boolean judgeCircle(String move) {
        int x = 0;
        int y = 0;

        for(int i = 0; i < move.length(); i++) {
            char command = move.charAt(i);
            switch (command) {
                case 'U':
                case 'u':
                    y++;
                    break;
                case 'D':
                case 'd':
                    y--;
                    break;
                case 'R':
                case 'r':
                    x++;
                    break;
                case 'L':
                case 'l':
                    x--;
                    break;
                default:
                    System.out.println("Command not found");
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
