import java.util.*;
public class buy_sell_stocks {
    public static void profit(int arr[]) {
        //calculate buying price and selling price at every day
        int buy_price[] = new int[arr.length];
        buy_price[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            buy_price[i] = Math.min(buy_price[i - 1], arr[i]);
        }
        int selling_price[] = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            selling_price[i] = arr[i];

        }

        int max_profit = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            int profit = selling_price[i] - buy_price[i];
            if (profit > max_profit) {
                max_profit = profit;
            }

        }
        System.out.println(max_profit);
    }

    public static void main(String[] args){
        int stocks_data[]={7,1,5,3,6,4};
        profit(stocks_data);

    }
}
