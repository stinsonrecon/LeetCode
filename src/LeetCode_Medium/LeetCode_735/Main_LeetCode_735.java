package LeetCode_Medium.LeetCode_735;

//We are given an array asteroids of integers representing asteroids in a row.
//For each asteroid, the absolute value represents its size, and the sign represents its direction
//(positive meaning right, negative meaning left). Each asteroid moves at the same speed.
//Find out the state of the asteroids after all collisions.
//If two asteroids meet, the smaller one will explode. If both are the same size, both will explode.
//Two asteroids moving in the same direction will never meet.

import java.util.Arrays;
import java.util.LinkedList;

public class Main_LeetCode_735 {
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        LinkedList<Integer> list = new LinkedList();

        for( int a : asteroids )
        {
            int sign = list.size()==0 ? a : a * list.getLast();
            if( sign > 0 || list.isEmpty() || list.getLast() < 0 ) {
                list.add( a ); //sign > 0 for same direction, if last asteroid is negative , just add the current asteroid
            }
            else
            {
                // current asteroid is negative and previous asteroid is +ve ( Collision)
                int diff = a;
                while( !list.isEmpty() && list.getLast() > 0 ) //determine till when collision will happen
                {
                    diff = a;
                    int last = list.getLast();
                    diff += list.removeLast();
                    if( diff >= 0 )
                    {
                        if( diff > 0 )
                            list.add( last);
                        break;
                    }
                }
                if( diff < 0 )
                    list.add( a );
            }
        }

        int r[] = new int[list.size()];
        for( int i =0; i < list.size(); i++ ) {
            r[i] = list.get( i );
        }
        return r;
    }
}
