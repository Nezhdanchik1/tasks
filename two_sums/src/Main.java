public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6, 7, 8};
        int target = 11;

//        Пример: [1,2,5,6,7,8] 	целевая сумма = 11;
//        Результат: 5+6 = 11

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            int sum = nums[i] + nums[j];

            if (sum != target) {
                if (sum > target) {
                    j--;
                } else {
                    i++;
                }
            } else {
                System.out.println(nums[i] + " + " + nums[j] + " = " + target);
                return;
            }
        }
    }
}