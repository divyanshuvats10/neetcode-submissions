class Solution {
    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int index = n - 1;

        for (int i = 0; i <= index; i++) {
            while (index > i && nums[index] == val) {
                index--;
            }

            if (nums[i] == val) {
                swap(nums, i, index);
                index--;
            }
        }

        return index + 1;
    }
}
