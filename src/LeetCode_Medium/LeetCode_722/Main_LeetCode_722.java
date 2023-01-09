package LeetCode_Medium.LeetCode_722;

//Given a C++ program, remove comments from it.
//The program source is an array of strings source where source[i] is the ith line of the source code.
//This represents the result of splitting the original source code string by the newline character '\n'.

//Ý tưởng:
//Nếu có '//', skip dòng đang đọc
//Nếu có '/*', skip cho tới khi gặp '*/'
//Nếu không phải 2 trường hợp trên, thêm dòng đang đọc vào mảng chứa

import java.util.ArrayList;
import java.util.List;

public class Main_LeetCode_722 {
    public List<String> removeComments(String[] source) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean mode = false;
        for (String s : source) {
            for (int i = 0; i < s.length(); i++) {
                if (mode) {
                    if (s.charAt(i) == '*' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
                        mode = false;
                        i++;        //skip '/' on next iteration of i
                    }
                }
                else {
                    if (s.charAt(i) == '/' && i < s.length() - 1 && s.charAt(i + 1) == '/') {
                        break;      //ignore remaining characters on line s
                    }
                    else if (s.charAt(i) == '/' && i < s.length() - 1 && s.charAt(i + 1) == '*') {
                        mode = true;
                        i++;           //skip '*' on next iteration of i
                    }
                    else    sb.append(s.charAt(i));     //not a comment
                }
            }
            if (!mode && sb.length() > 0) {
                res.add(sb.toString());
                sb = new StringBuilder();   //reset for next line of source code
            }
        }
        return res;
    }
}
