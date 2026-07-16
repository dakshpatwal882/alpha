class stock {
    public static int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0 ; i<prices.length; i++)
        {
            if (bp>prices[i])
            {
                bp= prices[i];
            }
            else{
               int profit = prices[i]- bp;
                maxprofit=Math.max( profit, maxprofit); 
            }           
        }return maxprofit;
    }

public static void main(String[] args) {
    int prices []= {7,4,11,3,23};
    System.out.println(maxProfit(prices));
    
}

}