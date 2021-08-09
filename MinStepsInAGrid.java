/*Since we can move in any of the 8 direction. 
Take maximum moves we can make in any direction by taking absolute difference.*/

public class Solution {
    public int coverPoints(int[] A, int[] B) {
        int res = 0;
        
        //O(n)
        for(int i=0;i<A.length-1;i++){
            int temp = Math.max(Math.abs(A[i+1]-A[i]),Math.abs(B[i+1]-B[i]));
            res+=temp;
        }
        return res;
    }
}

//Overall Time Complexity is O(n)
