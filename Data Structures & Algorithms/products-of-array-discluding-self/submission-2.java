class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int ans[] = new int[nums.length];
        // for(int i = 0;i < nums.length;i++){
        //     int prod = 1;
        //     for(int j = 0;j < nums.length;j++){
        //         if(j == i){
        //             continue;
        //         } else {
        //             prod = prod * nums[j];
        //         }
        //     }
        //     ans[i] = prod;
        // }
        // return ans;
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int ans[] = new int[n];
        prefix[0] = 1;
        for(int i = 1;i < n;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        suffix[n-1] = 1;
        for(int i = n-2;i >= 0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];
        }
        for(int i = 0;i < n;i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;
    }
}  
