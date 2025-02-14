public class SortedArray {
    static void isSorted(int[] nums, int i) {
        if (i == nums.length - 1) {
            System.out.println("The Array is Sorted");
            return;
        }

        if (nums[i] > nums[i + 1]) {
            System.out.println("The Array is Not Sorted");
            return;
        }
        isSorted(nums, i + 1);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 3, 5, 6 };
        isSorted(nums, 0);
    }

}
