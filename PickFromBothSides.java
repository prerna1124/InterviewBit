public class Solution {
    public int solve(int[] A, int B) {
        
        int res = Integer.MIN_VALUE;
        int left=0,right=0;
      
        //Take sum of left B elements O(B)
        for(int i=0;i<B;i++){
            left+=A[i];
        }
      
        //Take sum of right B elements O(B)
        for(int i=A.length-1;i>=A.length-B;i--){
            right+=A[i];
        }
        
        //update max value
        res=Math.max(left,right);
        
        //Now delete one element from left and add from right and update res with max value. O(B)
        int f1=B-1;
        int e1=A.length-1;
        while(f1>=0){
            left-=A[f1];
            left+=A[e1];
            res=Math.max(res,left);
            e1--;
            f1--;
        }
        
        //Now delete one element from right and add from left and update res with max value. O(B)
        f1=0;
        e1=A.length-B;
        while(e1<A.length){
            right-=A[e1];
            right+=A[f1];
            res=Math.max(res,right);
            f1++;
            e1++;
        }
        
        //return res.
        return res;
    }
}

//Overall Time Complexity is O(B)
