package LeetCode_Medium.LeetCode_720;

//Given an array of strings words representing an English Dictionary,
//return the longest word in words that can be built one character at a time by other words in words.
//If there is more than one possible answer, return the longest word with the smallest lexicographical order.
//If there is no answer, return the empty string.
//Note that the word should be built from left to right with each additional character being added to the end of a previous word.

//Cho mảng string, trả về từ dài nhất trong chuỗi có thể được tạo từ từng ký tự một bằng các từ khác trong các phần tử của mảng
//Nếu có nhiều hơn 1 từ có thể, trả về từ dài nhất với thự tự từ điển nhỏ nhất
//Nếu không có, trả về chuỗi rông

//Ý tưởng:
//Sắp xếp các từ theo thứ tự bảng chữ cái => các từ ngắn hơn luôn xuất hiện trước các từ dài hơn
//Dọc theo danh sách được sắp xếp, điền các từ có thể được tạo
//Bất kỳ tiền tố nào của 1 từ phải đứng trước từ đó

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_LeetCode_720 {
    public static void main(String[] args) {
        String[] words = {"a","banana","app","appl","ap","apply","apple"};

        System.out.println(longestWord(words));
    }

    public static String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> built = new HashSet<String>();
        String res = "";
        for (String w : words) {
            if (w.length() == 1 || built.contains(w.substring(0, w.length() - 1))) {
                res = w.length() > res.length() ? w : res;
                built.add(w);
            }
        }
        return res;
    }
}
