package Arrays;

class RotateLeftByK {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int [] temp = new int[k];

        for(int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        for(int i = k; i < n; i++) {
            nums[i-k] = nums[i];
        }

        //  n = 7, k = 3  --> i + k - n --> 4 + 3 - 7
        for(int i = n -k; i < n; i++) {
            nums[i] = temp[i -(n-k)];
        }
    }
}