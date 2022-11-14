package LeetCode_Medium.LeetCode_658;

//Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array.
//The result should also be sorted in ascending order.
//An integer a is closer to x than an integer b if:
//|a - x| < |b - x|, or
//|a - x| == |b - x| and a < b

import java.util.ArrayList;
import java.util.List;

public class Main_LeetCode_658 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 4;
        int x = 6;

        System.out.println(findClosestElements(arr, k, x));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length - 1;
        List<Integer> res = new ArrayList<>(k);

        while (end - start >= k){
            if(Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++;
            }
            else {
                end--;
            }
        }

        for(int i = start; i <= end; i++) {
            res.add(arr[i]);
        }
        bubbleSort(res);
        return res;
    }

    public static void bubbleSort(List<Integer> list)
    {
        Integer temp;
        if (list.size()>1)
        {
            for (int x=0; x<list.size(); x++)
            {
                for (int i=0; i < list.size() - x - 1; i++) {
                    if (list.get(i).compareTo(list.get(i+1)) > 0)
                    {
                        temp = list.get(i);
                        list.set(i,list.get(i+1) );
                        list.set(i+1, temp);
                    }
                }
            }
        }
    }
}
