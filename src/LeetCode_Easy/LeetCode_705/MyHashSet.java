package LeetCode_Easy.LeetCode_705;

public class MyHashSet {
    private int size = (int) Math.pow(10,6) + 1;
    private boolean[] flag;

    public MyHashSet() {
        this.flag = new boolean[size];
    }

    public void add(int key) {
        this.flag[key] = true;
    }

    public void remove(int key) {
        this.flag[key] = false;
    }

    public boolean contain(int key) {
        return this.flag[key];
    }
}
