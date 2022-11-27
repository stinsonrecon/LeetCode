package LeetCode_Easy.LeetCode_830;

//Task:
//In a string s of lowercase letters, these letters form consecutive groups of the same character.
//For example, a string like s = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z", and "yy".
//A group is identified by an interval [start, end], where start and end denote the start and end indices (inclusive) of the group.
//In the above example, "xxxx" has the interval [3,6].
//A group is considered large if it has 3 or more characters.
//Return the intervals of every large group sorted in increasing order by start index.

//Cho chuỗi chữ, từng ký tự trong chuỗi tạo nên các chuỗi con gồm các ký tự giống nhau
//1 nhóm được định nghĩa bơi điểm bắt đầu và điểm kết thúc [start,end], trong đó start là index của ký tự đầu tiên của nhóm con có trong chuỗi s,
//end là index của ký tự cuối cùng của nhóm con có trong chuỗi s
//1 nhóm con cần có 3 ký tự trở lên
//Trả về mảng chứa các nhóm con theo định dạng trên

//ý tưởng:
//Với mỗi nhóm con
//Tìm điểm bắt đầu (index i) và điểm kết thúc (index j - 1)
//Độ dài của nhóm là j - 1
//Nêu độ dài bé hơn 3, thêm (i, j) và mảng trả về

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_LeetCode_830 {
    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";

        System.out.println(largeGroupPositions(s));
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0, j = 0; i < s.length(); i = j) {
            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                ++j;
            }
            if(j - i >= 3) {
                res.add(Arrays.asList(i, j - 1));
            }
        }
        return res;
    }
}
