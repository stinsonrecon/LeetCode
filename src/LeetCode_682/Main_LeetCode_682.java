package LeetCode_682;

import java.util.LinkedList;

public class Main_LeetCode_682 {
    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }

    public static int calPoints(String[] operations) {
        LinkedList<Integer> list = new LinkedList<>();
        int sum = 0;
        for(int i = 0; i < operations.length; i++){
            String op = operations[i];
            switch (op){
                case "C":
                    sum -= list.removeLast();
                    break;
                case "D":
                    int item = list.getLast();
                    list.addLast(item*2);
                    sum+=item*2;
                    break;
                case "+":
                    int value = list.get(list.size()-2)+list.getLast();
                    list.addLast(value);
                    sum+=value;
                    break;
                default:
                    list.addLast(Integer.parseInt(op));
                    sum+=Integer.parseInt(op);
                    break;
            }
        }
        return sum;
    }
}
