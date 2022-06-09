import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
      
   		int size = permutation.size();
        if(size<=1)
            return permutation;
        int i=size-2;
        while(i>=0 && permutation.get(i)>=permutation.get(i+1))
            i--;
            
        if(i>=0)
        {
            int j = size-1;
            while(permutation.get(j)<=permutation.get(i))
            {
                j--;
            }
            
            Collections.swap(permutation,i,j);
        }
       reverse(permutation,i+1,size-1);
        return permutation;
	}

    public static void reverse(ArrayList<Integer> permutation,int i, int j)
    {
        while(i<j)
        {
            Collections.swap(permutation,i,j);
            i++;
            j--;
        }
    }
}
