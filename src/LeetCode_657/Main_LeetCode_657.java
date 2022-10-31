package LeetCode_657;

import java.util.Scanner;

//There is a robot starting at the position (0, 0), the origin, on a 2D plane.
//Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
//You are given a string moves that represents the move sequence of the robot where moves[i] represents its ith move.
//Valid moves are 'R' (right), 'L' (left), 'U' (up), and 'D' (down).
//Return true if the robot returns to the origin after it finishes all of its moves, or false otherwise.

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
