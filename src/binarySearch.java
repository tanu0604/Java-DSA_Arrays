public class binarySearch {
    public static void main(String[] args) {
        int [] nums={3, 12 ,18 ,28, 29, 30, 35 ,36, 40, 45 };
        int target=3;
        int ans=search(nums,target);
        System.out.println(ans);
    }
     static int search(int []nums, int target) {
        // Write your code here.
        int start=0;
        int end = nums.length-1;
        int mid;
        while(start<=end)
        {
            mid = start+(end-start)/2;
            if(target>nums[mid])
            {
                start=mid+1;
            }
            else if(target<nums[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
}