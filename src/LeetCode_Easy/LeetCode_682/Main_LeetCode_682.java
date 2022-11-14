package LeetCode_Easy.LeetCode_682;

import java.util.LinkedList;

//You are keeping the scores for a baseball game with strange rules.
//At the beginning of the game, you start with an empty record.
//You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and
//is one of the following:
//An integer x.
//Record a new score of x.
//'+'.
//Record a new score that is the sum of the previous two scores.
//'D'.
//Record a new score that is the double of the previous score.
//'C'.
//Invalidate the previous score, removing it from the record.
//Return the sum of all the scores on the record after applying all the operations.

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
