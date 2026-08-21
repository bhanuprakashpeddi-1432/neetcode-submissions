class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] res = new int[nums.length];
        int tp = 1;
        res[0] =1;

        for(int i =1; i<nums.length ; i++){
            res[i] = res[i-1] * nums[i-1];
        }
        
        int suffixProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            // Multiply the stored prefix product by the current suffix product
            res[i] = res[i] * suffixProduct;
            // Update the suffix product for the next iteration (moving left)
            suffixProduct = suffixProduct * nums[i];
        }
        
        return res;

    }
}  
