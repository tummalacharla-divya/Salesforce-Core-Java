/*
3. Best Time to Buy and Sell Stock
 
Problem: You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by
 choosing a single day to buy one stock and choosing a different day in the future to sell that stock. 
Example:
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 
*/

class BuyAndSellStock{
	public static void main(String[] args){
		int[] prices={7,1,5,3,6,4};
		System.out.println(buyAndSell(prices));
	}
	public static int buyAndSell(int[] prices){
		int maxprofit=Integer.MIN_VALUE;
		int diff=0;
		for(int i=0;i<prices.length;i++){
			for(int j=i;j<prices.length;j++){
				diff=Math.abs(prices[i]-prices[j]);
				if((prices[i]<prices[j]) && (diff>maxprofit)){
					maxprofit=diff;
				}
			}
		}
		return maxprofit;
	
		
		/*int buy = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
		*/
		
		/*
		int minP=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++){
            minP=Math.min(minP,prices[i]);
            res=Math.max(res,prices[i]-minP);
        }
        return res;
		*/
	}
}