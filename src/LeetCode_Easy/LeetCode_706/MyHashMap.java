package LeetCode_Easy.LeetCode_706;

import java.util.Arrays;

public class MyHashMap {
    private int[] data;

    public MyHashMap() {
        this.data = new int[1000001];
        Arrays.fill(data, -1);
    }

    public void put(int key, int value) {
        this.data[key] = value;
    }

    public int get(int key) {
        return data[key];
    }

    public void remove(int key) {
        this.data[key] = -1;
    }
}
