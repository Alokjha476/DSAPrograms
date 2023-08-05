package Array;

public class BuyAndSellStock {
    public static int Buy_Sell_Stock(int sellingPrice[]) {
        int buyPrice = Integer.MAX_VALUE ;       // +infinity
        int maxProfit = 0;
        for (int i = 0; i < sellingPrice.length; i++) {
            if (buyPrice < sellingPrice[i]) { //comming profit
                int profit = sellingPrice[i] - buyPrice; // todays profit
                 maxProfit = Math.max(maxProfit,profit);
            } else {
                buyPrice = sellingPrice[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int sellingPrices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(Buy_Sell_Stock(sellingPrices));
    }
}
