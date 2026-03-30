class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int s = 0;
        int e = arr.length-1;
        int ub = e+1;
        while(s<=e)
        {
            int m = s + (e - s);
            if(arr[m] >target)
            {
                e = m-1;
                ub = m;
            }
            else 
             s = m + 1;
        }
        return ub;
    }
}
