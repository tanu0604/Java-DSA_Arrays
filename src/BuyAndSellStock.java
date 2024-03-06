//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BuyAndSellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int profit = maxProfit(prices);
        System.out.println(profit);
    }

    static int maxProfit(int[] prices) {
        int mini=prices[0],maxprofit=0;
        for(int i=1;i<prices.length;i++)
        {
            int profit=prices[i]-mini;
            maxprofit=Math.max(maxprofit,profit);
            mini=Math.min(mini,prices[i]);
        }
        return maxprofit;
    }
}
