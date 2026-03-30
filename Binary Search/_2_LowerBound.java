class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int s = 0;
        int e = arr.length-1;
        int lb = e+1;
        while(s<=e)
        {
            int m = s + (e - s);
            if(arr[m] >=target)
            {
                e = m-1;
                lb = m;
            }
            else 
             s = m + 1;
        }
        return lb;
    }
}
