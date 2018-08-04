package Array;

public class StockSellBuy {

    public int getMaxProfitBuySellOnce(int s[]){
        int buy = s[0];
        int sell = s[0];
        int maxProfit = buy - sell;

        for(int i = 1 ; i< s.length; i++){
            if(s[i] > s[i-1]){
                sell = s[i];
            }else{
                if(sell - buy > maxProfit)
                    maxProfit = sell-buy;

                if(buy > s[i])
                    buy = s[i];
                sell = s[i];
            }
        }
        if(sell - buy > maxProfit)
            maxProfit = sell - buy;
        return maxProfit;
    }
}
