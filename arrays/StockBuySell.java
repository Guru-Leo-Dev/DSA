import java.util.*;
class StockBuySellSolution {
    // Function to calculate max profit using brute force
    public int stockbuySell(int[] prices) {
        // Initialize max profit to 0
        int maxProfit = 0;

        // Loop through each day as a potential buy day
        for (int i = 0; i < prices.length; i++) {
            // Loop through each future day as a potential sell day
            for (int j = i + 1; j < prices.length; j++) {
                // Calculate profit
                int profit = prices[j] - prices[i];

                // Update max profit if higher
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        // Return the maximum profit
        return maxProfit;
    }
}

// Main class to run the program
public class StockBuySell {

    public static void main(String[] args) {
        StockBuySellSolution sol = new StockBuySellSolution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + sol.stockbuySell(prices));
    }
}
class Solution {
   
}

// Driver class
class Main {
}
