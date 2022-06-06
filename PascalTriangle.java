import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
       ArrayList<ArrayList<Long>> result = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> curr, prev = null;
        for(int i=0;i<n;i++)
        {
            curr = new ArrayList<Long>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    curr.add((long)1);
                else
                    curr.add(prev.get(j-1)+prev.get(j));
            }
            result.add(curr);
            prev = curr;
        }
        return result;
	}
}
