import java.util.*;

public class majorityN_3 {
    public static List<Integer> majorityElement(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int count1 = 0, n = arr.length;
        int ele = 0;

        // Find the potential majority element
        for (int i = 0; i < n; i++) {
            if (count1 == 0) {
                count1++;
                ele = arr[i];
            } else if (ele == arr[i]) {
                count1++;
            } else
                count1--;
        }

        // Count the occurrences of the potential majority element
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (ele == arr[i]) {
                count2++;
            }
        }

        // Check if the potential majority element occurs more than n/3 times
        if (count2 > n / 3) {
            result.add(ele);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2};
        List<Integer> majorityElements = majorityElement(arr);
        System.out.println("Majority Element(s): " + majorityElements);
    }
}
