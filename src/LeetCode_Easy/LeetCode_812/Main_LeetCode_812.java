package LeetCode_Easy.LeetCode_812;

//SABC = 1/2 * |Xa.Yb + Xb.Yc + Xc.Ya - Xa.Yc -Xc.Yb - Xb.Ya|
public class Main_LeetCode_812 {
    public static void main(String[] args) {
        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};

        System.out.println(largestTriangleArea(points));
    }

    public static double largestTriangleArea(int[][] p) {
        double res = 0;
        for (int[] i: p)
            for (int[] j: p)
                for (int[] k: p)
                    res = Math.max(res, 0.5 * Math.abs(i[0] * j[1] + j[0] * k[1] + k[0] * i[1]- j[0] * i[1] - k[0] * j[1] - i[0] * k[1]));
        return res;
    }
}
