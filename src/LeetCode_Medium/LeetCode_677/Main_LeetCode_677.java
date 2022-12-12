package LeetCode_Medium.LeetCode_677;

//Design a map that allows you to do the following:
//
//Maps a string key to a given value.

//Returns the sum of the values that have a key with a prefix equal to a given string.

//Implement the MapSum class:

//MapSum() Initializes the MapSum object.

//void insert(String key, int val) Inserts the key-val pair into the map. If the key already existed,
//the original key-value pair will be overridden to the new one.

//int sum(string prefix) Returns the sum of all the pairs' value whose key starts with the prefix.

import java.util.HashMap;

public class Main_LeetCode_677 {
    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple", 3);
        mapSum.sum("ap");
        mapSum.insert("app", 2);
        mapSum.sum("ap");
    }

    public static class MapSum {
        private HashMap<String, Integer> map;
        public MapSum() {
            this.map = new HashMap<>();
        }
        public void insert(String key, int val) {
            this.map.put(key, val);
        }
        public int sum(String prefix) {
            int ans = 0;
            for (String key: this.map.keySet()) {
                if (key.startsWith(prefix)) {
                    ans += this.map.get(key);
                }
            }
            return ans;
        }
    }
}
