import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
      boolean col = true;
        int N = matrix.length;
        int M = matrix[0].length;
        
        for(int i=0;i<N;i++)
        {
            if(matrix[i][0]==0)
                col=false;
            for(int j=1;j<M;j++)
            {
                if(matrix[i][j]==0)
                    matrix[i][0]=matrix[0][j]=0;
            }
        }
        
        for(int i=N-1;i>=0;i--)
        {
            for(int j=M-1;j>=1;j--)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
            if(col==false)
                matrix[i][0]=0;;
        }
    }

}