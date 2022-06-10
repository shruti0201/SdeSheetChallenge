import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        
        int minr = 0, minc = 0, maxr = n - 1, maxc = m - 1;
        if(maxr == 0 || maxc == 0) return;
        while(minc<maxc && minr<maxr){
            int temp = mat.get(minr).get(minr);
            
            for(int j = minc + 1;j<=maxc;j++){
                int swp = temp;
                temp = mat.get(minr).get(j);
                mat.get(minr).set(j, swp);
            }
            
            for(int i = minr + 1;i<=maxr;i++){
                int swp = temp;
                temp = mat.get(i).get(maxc);
                mat.get(i).set(maxc, swp);
            }
            
            for(int j = maxc - 1;j>=minc;j--){
                int swp = temp;
                temp = mat.get(maxr).get(j);
                mat.get(maxr).set(j, swp);
            }
            
            for(int i = maxr - 1;i>=minr;i--){
                int swp = temp;
                temp = mat.get(i).get(minc);
                mat.get(i).set(minc, swp);
            }
            
            minc++;
            minr++;
            maxc--;
            maxr--;
        }
    }
}
