//Maximum Consecutive 1
//https://www.codingninjas.com/studio/problems/maximum-consecutive-ones_3843993?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
public class MaximumCon1 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,0,1,1,1,2};
        int max=0,count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if(max<count)
                {
                    max=count;
                }
            }
            else {
                count = 0;
            }
        }
        System.out.println(max);
    }
}
