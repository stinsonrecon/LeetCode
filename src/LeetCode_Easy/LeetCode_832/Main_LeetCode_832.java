package LeetCode_Easy.LeetCode_832;

//Task:
//Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
//To flip an image horizontally means that each row of the image is reversed.
//For example, flipping [1,1,0] horizontally results in [0,1,1].
//To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
//For example, inverting [0,1,1] results in [1,0,0].

//Cho ma trận hình ảnh nhị phân n x n, lật ảnh theo chiều ngang, đảo ngược nó và trả về kết quả

//Ý tưởng:
//Đảo 0 -> 1; 1 -> 0

import java.util.Arrays;

public class Main_LeetCode_832 {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] image2 = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image2)));
    }

    public static int[][] flipAndInvertImage(int[][] image)
    {
        for (int i = 0; i< image.length; i++)
        {
            image[i] = reverseImage(image[i]);
        }

        return image;
    }

    public static int[] reverseImage(int[] image)
    {
        int j = 0;
        int c [] = new int [image.length];

        for (int i = image.length -1; i>=0; i --)
        {
            if (image[i] == 0)
            {
                c[j] = 1;
            }
            else if (image[i] == 1)
            {
                c[j] = 0;
            }

            j++;
        }
        return c;
    }
}
