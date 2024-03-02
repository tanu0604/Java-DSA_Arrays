//https://www.codingninjas.com/studio/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?utm_source=striver&utm_medium=website&utm_campaign=codestudio_a_zcourse&leftPanelTabValue=SUBMISSION
public class LargestElement
{
    public static void main(String[] args) {
        int [] arr={3,2,4,6,7};
        int largest=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
