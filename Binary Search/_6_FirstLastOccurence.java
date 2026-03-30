class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int fo= -1;
        int lo = -1;
        while(s<=e)
        {
            int m = s + (e - s)/2;
            if(nums[m] == target)
            {
                fo = m;
                e = m -1;
            }
            else if(nums[m] > target)
            e = m - 1;
            else
            s = m + 1;
        }
        s = 0;
        e = nums.length - 1;

        while(s<=e)
        {
            int m = s + (e - s)/2;
            if(nums[m] == target)
            {
                lo = m;
                s = m + 1;
            }
            else if(nums[m] > target)
            e = m - 1;
            else
            s = m + 1;
        }
        int[] ans = {-1, -1};
        ans[0] = fo;
        ans[1] = lo;
        return ans;
    }
}
