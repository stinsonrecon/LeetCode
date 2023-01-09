package LeetCode_Medium.LeetCode_692;

//Given an array of strings words and an integer k, return the k most frequent strings.
//
//Return the answer sorted by the frequency from highest to lowest.
//Sort the words with the same frequency by their lexicographical order.

//Cho dãy chữ và số nguyên k, trả về tần số chữ lặp lại k lần nhiều nhất theo chiều giảm dần,
//với các chữ có tần suất lặp lại giống nhau, sắp xếp theo thứ tự bảng chữ cái

//Ý tưởng:
//Tạo map lưu trữ tần suất lặp lại của chữ
//dùng hàm toCompare() để sắp xếp chữ theo thứ tự bảng chữ cái

import java.util.*;

public class Main_LeetCode_692 {
    public static void main(String[] args) {
        String[] words = {"i","love","leetcode","i","love","coding"};
        int k = 2;

        System.out.println(topKFrequent(words,k).toString());
    }

    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>(); // Map to store the freq of the words

        for (String word : words) {   // Counting Freq
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        ArrayList<String> ans = new ArrayList<>(map.keySet()); // List with all words

        ans.sort((A1, A2) ->  // sorting
                Objects.equals(map.get(A1), map.get(A2)) //if two has same freq
                        ? A1.compareTo(A2)  //(True) one with lower alphabetical order comes first(lexicographical order)
                        : map.get(A2) - map.get(A1)); //(False) else most freq will come first

        return ans.subList(0, k);
    }
}
