package Arrays;

public class SecondLargestElement {
    public int secondLargestElement(int[] nums) {
        int largest = nums[0], secondLargest = -1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }
            else if(nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
}
