//https://www.codingninjas.com/studio/problems/superior-elements_6783446?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse

import java.util.ArrayList;
import java.util.List;

public class superiorElement {
    public static List<Integer> superiorElements(int[] a) {
        List<Integer> leaders = new ArrayList<>();
        int maxi=Integer.MIN_VALUE;
        int n = a.length;

        for (int i = n-1; i >= 0; i--) {
            if(a[i]>maxi)
            {
                leaders.add(a[i]);
                maxi=a[i];
            }
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] array = {16, 17, 4, 3, 5, 2};
        List<Integer> superior = superiorElements(array);
        System.out.println("Superior elements: " + superior);
    }
}

