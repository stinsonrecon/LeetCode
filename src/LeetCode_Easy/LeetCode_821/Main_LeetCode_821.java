package LeetCode_Easy.LeetCode_821;

//Task:
//Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length
//and answer[i] is the distance from index i to the closest occurrence of character c in s.
//The distance between two indices i and j is abs(i - j), where abs is the absolute value function.

//Cho chuỗi s và đích c nằm trong chuỗi s, trả về mảng số mà độ dài của mảng bằng độ dài chuỗi s cho trước và từng phần tử
//trong mảng trả về là khoảng khách ngắn nhất của phần tử tại (i) trong chuỗi s tới đích c.

//Ý tưởng:
//Initial result array. Khởi tạo mảng trả về
//Lặp 2 lần qua chuỗi String cho trước
//lần loop đầu tiên chạy từ đầu tới cuối chuỗi, tìm ra khoảng cách ngắn nhất tới đích c phía bên trái
//Lần loop thứ 2 chạy từ cuối lên trên tìm khoảng cách ngắn nhất tới đích c phía bên phải

import java.util.Arrays;

public class Main_LeetCode_821 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';

        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }

    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int pos = -n;
        //Tạo giá trị mốc để đảm bảo khoảng cách s.charAt(i) tới đích c trong lần loop đầu tiên không bị tính sai
        //Giả sử ví dụ là aacaacacaca và C = 'c'. Chữ c đầu tiên ở chỉ số 2. Ở lần vượt qua đầu tiên, hai giá trị 'a' sẽ
        //có hiệu số lần lượt là 0 - (-12) = 12 và 1 - (-12) = 13, vì pos = - n = -12.
        //Khi đạt đến 'c' đầu tiên, các giá trị 'a' phía trước nó sẽ được so sánh với chỉ mục của nó, cho đến khi đạt đến
        //'c' tiếp theo, v.v.
        //Trên đường quay lại, khi cuối cùng cũng đạt được 'c' bên trái đó, sự khác biệt thực sự cho các giá trị 'a'
        //ngoài cùng bên trái sẽ được tính là 2 - 1 = 1 và 2 - 0 = 2, vì pos bây giờ sẽ bằng chỉ số của chữ 'c' đầu tiên, là 2.

        int res[] = new int[n];

        for(int i = 0; i < n; ++i) {
            char ele = s.charAt(i);
            if(ele == c) {
                pos = i;
            }

            res[i] = i - pos;
        }

        for(int i = pos - 1; i >= 0; --i) {
            char ele = s.charAt(i);
            if(ele == c) {
                pos = i;
            }

            res[i] = Math.min(res[i], pos - i);
        }
        return res;
    }
}
