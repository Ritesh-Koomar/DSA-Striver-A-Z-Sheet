class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int s = 0;
        int e = arr.length - 1;
        int lb = -1;
        while(s<=e)
        {
            int m = s + (e - s)/2;
            if(arr[m] <= x)
            {
                lb = m;
                s = m + 1;
            }
            else
            {
                e = m - 1;
            }
            
        }
        return lb;
    }
}
