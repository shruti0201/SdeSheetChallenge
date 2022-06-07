import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long result=0;
        long curr=0;
        for(int i=0;i<n;i++)
        {
            curr+=arr[i];
            curr = Math.max(curr,arr[i]);
            result = Math.max(result,curr);
        }
        return result;
	}

}
