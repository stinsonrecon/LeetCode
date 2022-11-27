package LeetCode_Easy.LeetCode_824;

//Task:
//You are given a string sentence that consist of words separated by spaces. Each word consists of lowercase and uppercase letters only.
//We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.) The rules of Goat Latin are as follows:
//If a word begins with a vowel ('a', 'e', 'i', 'o', or 'u'), append "ma" to the end of the word.
//For example, the word "apple" becomes "applema".
//If a word begins with a consonant (i.e., not a vowel), remove the first letter and append it to the end, then add "ma".
//For example, the word "goat" becomes "oatgma".
//Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
//For example, the first word gets "a" added to the end, the second word gets "aa" added to the end, and so on.
//Return the final sentence representing the conversion from sentence to Goat Latin.

//Cho chuỗi câu có ngăn cách các từ bằng dấu space. Mỗi từ chỉ chứa chữ thường và chữ in hoa. Chuyển chuỗi câu thành dạng sau:
//Chứa nguyên âm thì thêm "ma" ở cuối từ
//Chứa phụ âm thì chuyển chữ cái đầu xuống cuối chữ và thêm "ma"
//Với mỗi từ thêm 'a' với số lượng tương ứng với chỉ mục, bắt đầu từ 1
//Trả về chuỗi sau khi biến đổi

//Ý tưởng:
//Tạo mảng nguyên âm
//Tách chuỗi câu S thành từng từ
//Với mỗi từ, kiểm tra xem có bắt đầu là nguyên âm hay không
//Nếu có, duyệt từ tiếp theo. Nếu không, đảo chữ cái đầu tiên xuống cuối
//Thêm vào string trả về

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main_LeetCode_824 {
    public static void main(String[] args) {
        String s = "I speak Goat Latin";
        System.out.println(toGoatLatin(s));
    }

    public static String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        String res = "";
        int i = 0, j = 0;
        for (String w : sentence.split("\\s")) {
            if(vowels.contains(w.charAt(0))) {
                res += ' ' + w + "ma";
            }
            else {
                res += ' ' + w.substring(1) + w.charAt(0) + "ma";
            }
            //mỗi lần duyệt xong 1 từ thì update i trước (tương ứng với số từ trong chuỗi res, sau đó thêm a tương ứng với số i.
            //Nối chuỗi xong thì update j về 0 cho lần duyệt tiếp
            for (j = 0, ++i; j < i; ++j) {
                res += "a";
            }
        };
        return res.substring(1);
    }
}
