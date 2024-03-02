//https://www.codingninjas.com/studio/problems/find-the-single-element_6680465?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems
public class FindoOnce {
    public static void main(String[] args) {
        int []arr={1,1,2,3,3};
        int ans=FindOccurance(arr);
        System.out.println(ans);
    }
    static  int FindOccurance(int[] arr)
    {
//        int i;
//        for(i=0;i< arr.length;i+=2)
//        {
//            if(arr[i]== arr[arr.length-1])
//            {
//                return arr[i];
//            }
//            if(arr[i]!=arr[i+1])
//            {
//               return arr[i];
//            }
//
//        }
//        return -1;
        //Using the XOR method a XOR a=0
        int i,find=0;
        for ( i = 0; i < arr.length; i++) {
            find=find^arr[i];
        }
        return find;
    }

}
