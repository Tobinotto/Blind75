/* bestTimeStock: given a int array of stock prices, prices, determines the max profit that can be attained by
buying on one day and selling on another
*/

import java.util.ArrayList;
import java.util.Collections;

class SolutionBestTImeStock {
    // Brute force approach
    public static int maxProfitBrute(int[] prices) {
        ArrayList<Integer> maxProfits = new ArrayList<Integer>();
        for (int i=0; i<prices.length; i++) {
            int currPrice = prices[i];

            // getting the profits from selling on each day if bought on the ith day
            ArrayList<Integer> currProfits = new ArrayList<Integer>(prices.length - i);
            for (int j=i; j<prices.length; j++) {
                currProfits.add(prices[j] - currPrice);
            }
            maxProfits.add(Collections.max(currProfits));
        }
        
        return Collections.max(maxProfits);
    }

    // Sliding Window approach
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i=0; i<prices.length; i++) {
            int currPrice = prices[i];
            if (currPrice < minPrice) {
                minPrice = currPrice;
            } else if ((currPrice - minPrice) > maxProfit) {
                maxProfit = currPrice - minPrice;
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {4,1,5,2,7, 1, 1, 3, 8, 5, 6, 7, 8, 9, 11, 3, 4};
        System.out.println(maxProfit(prices));
    }
    
}
