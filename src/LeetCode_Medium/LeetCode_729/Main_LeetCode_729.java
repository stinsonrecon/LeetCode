package LeetCode_Medium.LeetCode_729;

//You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a double booking.
//A double booking happens when two events have some non-empty intersection (i.e., some moment is common to both events.).

//Ý tưởng:
//Tạo list cho thời gian bắt đầu và kết thúc
//Nếu thời gian bắt đầu và kết thúc có xung khắc, không thêm vào lịch và trả về false
//Nếu không, thêm vào lịch và trả về true

import java.util.ArrayList;
import java.util.List;

public class Main_LeetCode_729 {
    class MyCalendar {

        List<List<Integer>> timeline;
        public MyCalendar() {
            timeline = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for (List<Integer> interval : timeline) {
                if (start < interval.get(1) && end > interval.get(0)) {
                    return false;
                }
            }

            addInterval(start, end);
            return true;
        }

        private void addInterval(int start, int end) {
            List<Integer> interval = new ArrayList<>(2);
            interval.add(start);
            interval.add(end);
            timeline.add(interval);
        }
    }
}
