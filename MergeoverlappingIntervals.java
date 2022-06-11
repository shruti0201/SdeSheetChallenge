import java.util.* ;
import java.io.*; 
/*******************************************************

    Following is the Interval class structure

    class Interval {
        int start, int finish;

        Interval(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }
    
*******************************************************/

import java.util.List;
import java.util.ArrayList;

public class Solution {
    public static List<Interval> mergeIntervals(Interval[] arr) {
        List<Interval> result = new ArrayList<Interval>();
        int n = arr.length;
        
        if(n<=0)
            return result;
        
        Arrays.sort(arr,new Comparator<Interval>(){
           
            public int compare(Interval i1, Interval i2)
            {
                return i1.start - i2.start;
            }
        });
        
        int res=0;
        for(int i=1;i<n;i++)
        {
            if(arr[res].finish>=arr[i].start)
            {
                arr[res].start=Math.min(arr[res].start,arr[i].start);
 arr[res].finish = Math.max(arr[res].finish,arr[i].finish);
                
            }
            else{
                result.add(arr[res]);
                res++;
                arr[res]=arr[i];
            }
        }
        result.add(arr[res]);
        return result;
    }
}
