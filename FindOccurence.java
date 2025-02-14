public class FindOccurence {
    static int[] occurence(int[] nums, int i, int ele, int count) {
        if (i == nums.length) {
            return new int[count];
        }
        if (nums[i] == ele) {
            count++;
        }
        int result[] = occurence(nums, i + 1, ele, count);
        if (nums[i] == ele) {
            result[--count] = i;
        }

        return result;

    }

    public static void main(String[] args) {
        int nums[] = { 10, 20, 50, 40, 50 };
        int[] result = occurence(nums, 0, 50, 0);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
