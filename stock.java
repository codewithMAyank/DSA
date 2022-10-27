public class stock {
    public static int  stock_up_and_down(int [] stock_price) {
        // Integer.MAX_VALUE = + infinity
        // Integer.MIN_VALUE = - infinity
        int buy_price = Integer.MAX_VALUE;
        int max_profit= 0;
        for (int i= 0;i<stock_price.length;i++){
            if (buy_price<stock_price[i]){
                int profit = stock_price[i] - buy_price;
                max_profit = Math.max(max_profit,buy_price);
            } else {
                buy_price= stock_price[i];
            }
        }
        return max_profit;
    }
    public static void main(String[] args) {
        int [] stock_price= {93,57,29,934};
        System.out.println(stock_up_and_down(stock_price));
    }
}
