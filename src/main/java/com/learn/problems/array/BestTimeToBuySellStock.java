package com.learn.problems.array;
/*https://leetcode.com/problems/best-time-to-buy-and-sell-stock/*/

class BestTimeToBuySellStock {
    public static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        System.out.println("minprice "+minprice);
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    public int maxProfit_leet(int[] prices) {
        int ans=0;
        if(prices.length==0)
        {
            return ans;
        }
        int bought=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>bought)
            {
                if(ans<(prices[i]-bought))
                {
                    ans=prices[i]-bought;
                }
            }
            else
            {
                bought=prices[i];
            }
        }
        return ans;
    }


    // Driver method to test above
    public static void main(String args[]) {
        int prices[] = {1,2};
        System.out.println("Process starts");

        int profitValue = maxProfit(prices);
        System.out.println("profitValue "+profitValue);

    }


}
