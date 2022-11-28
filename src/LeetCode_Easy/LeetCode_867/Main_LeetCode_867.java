package LeetCode_Easy.LeetCode_867;

//Given a 2D integer array matrix, return the transpose of matrix.

//Cho ma trận, trả về chuyển vị ma trận

import java.util.Arrays;

public class Main_LeetCode_867 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(Arrays.deepToString(transpose(matrix)));
    }

    public static int[][] transpose(int[][] matrix) {
        int M = matrix.length, N = matrix[0].length;
        int[][] B = new int[N][M];
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < M; i++) {
                B[j][i] = matrix[i][j];
            }
        }
        return B;
    }
}
