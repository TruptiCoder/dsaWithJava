import java.util.HashSet;

public class assign6 {

    //Question no 1
    // Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

    //Brute force
    public static boolean duplicate(int nums[]){
        for(int i = 0; i<nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //Using sets
    //You should have a basic knowledge about java hashsets before following approch. it will be taught to you in later chapeters.

    public static boolean containDuplicate(int nums[]){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }

    //Question no 2
    //There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.You must write an algorithm with O(log n) runtime complexity.

    public int search(int[] nums, int target) {
        //min will have index of minimum element of nums
        int min = minSearch(nums);
        //find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1]){
            return search(nums,min,nums.length-1,target);
        }
        //find in sorted right
        else{
            return search(nums,0,min,target);
        }
    }

    //binary search to find target in left to right boundary
    public int search(int[] nums,int left,int right,int target){
        int l = left;
        int r = right;
        // System.out.println(left+" "+right);
        while(l <= r){
            int mid = l + (r - l)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }
    //smallest element index
    public int minSearch(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid > 0 && nums[mid-1] > nums[mid]){
                return mid;
            }
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }

    //Question no 3
    //You are given an array prices where prices[i] is the price of a given stock on the ith day.Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0

    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i=1; i<prices.length; i++) {
            if (buy < prices[i]) {
                profit = Math.max(prices[i] - buy, profit);
            }
            else {
                buy = prices[i];
            }
        }
        return profit;
    }

    //Question no 4
    //Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

    public int trap(int[] height) {
        int n = height.length;
        int res = 0, l = 0, r = n - 1;
        int rMax = height[r], lMax = height[l];
        while (l < r) {
            if (lMax < rMax) {
                l++;
                lMax = Math.max(lMax, height[l]);
                res += lMax - height[l];
            } else {
                r--;
                rMax = Math.max(rMax, height[r]);
                res += rMax - height[r];
            }
        }
        return res;
    }

    public static void main(String args[]){
        int nums[] = {1 , 2 , 6 , 2 , 4 , 10 , 14};
        // System.out.println(duplicate(nums));
    }
}