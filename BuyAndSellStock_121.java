// Question Link  https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BuyAndSellStock_121 {

    public static int maxProfit(int[] prices) {
        int profit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++)
        {
            if(buyPrice < prices[i])
            {
                if (profit < prices[i] - buyPrice)
                    profit = prices[i] - buyPrice;
            }
            else
                buyPrice = prices[i];
        }
        return profit;
    }

    public static void main(String[] args) {
        //  7,6,4,3,1
        int[] arr = {7,1,5,3,6,4};
        int profit = maxProfit(arr);
        System.out.println(profit);
    }
    
}