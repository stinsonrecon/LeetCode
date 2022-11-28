package LeetCode_Easy.LeetCode_859;

//Task:
//Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
//Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
//For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

//Cho 2 chuỗi s và goal, trả về true nếu có thể đổi chỗ 2 chữ cái trong s để kết quả trả về là goal

//Ý tưởng:
//Nếu độ dài chuỗi s và goal khác nhau => Trả về false
//Nếu s và goal bằng nhau, cần đổi chỗ 2 chữ cái giống nhau => Kiểm tra ký tự trùng lặp trong chuỗi s
//Trường hợp còn lại, tìm index của s[i] != goal[i]. Nếu chỉ có 2 ký tự khác nhau => return true

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main_LeetCode_859 {
    public static void main(String[] args) {
        String s = "ab", goal = "ab";

        System.out.println(buddyStrings(s,goal));
    }

    public static boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Set<Character> set = new HashSet<Character>();
            for (char c : s.toCharArray()) {
                set.add(c);
            }
            return set.size() < s.length();
        }
        List<Integer> dif = new ArrayList<>();

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != goal.charAt(i)) {
                dif.add(i);
            }
        }
        return dif.size() == 2 && s.charAt(dif.get(0)) == goal.charAt(dif.get(1)) && s.charAt(dif.get(1)) == goal.charAt(dif.get(0));
    }
}
