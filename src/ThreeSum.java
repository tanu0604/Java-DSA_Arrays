import java.util.*;
public class ThreeSum {
    public static List< List < Integer > > triplet(int n, int []nums) {
        // Write your code here.

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0)
                {
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }
                else{
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //Skip the duplicate elements
                    while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                    while(j<k && nums[k]==nums[k+1])
                    {
                        k--;
                    }
                }
            }
        }
        return ans;
    }
        public static void main(String[] args) {
        int nums[]={-1,-1,2,0,1};
        int n = nums.length;
        List<List<Integer>> ans = triplet(n, nums);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
}
