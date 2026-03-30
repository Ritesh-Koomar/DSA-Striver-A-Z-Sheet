class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        if(nums[0] > target)
        return 0;
        if(nums[e] < target)
        return e+1;
        int ub = e+1;

        while(s<=e)
        {
            int m = s + (e - s)/2;
            if(nums[m] == target)
            return m;
            if(nums[m]> target)
            {
                ub = m;
                e = m - 1;
            }
            else
            s = m + 1;
        }
        return ub;
    }
}
