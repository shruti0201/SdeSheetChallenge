import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        
        int maxProfit=0;
        int size = prices.size();
        int min_Price = Integer.MAX_VALUE;
        
        for(int i=0;i<size;i++)
        {
            if(prices.get(i)<min_Price)
                min_Price = prices.get(i);
            maxProfit = Math.max(maxProfit, prices.get(i)-min_Price);
        }
        return maxProfit;
    }
}