
import java.util.*;

class Leaders {

    public static List<Integer> leaders(int[] nums) {

        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            boolean l = true;

            for (int j = i + 1; j < n; j++) {

                if (nums[j] >= nums[i]) {
                    l = false;
                    break;
                }
            }

            if (l) {
                result.add(nums[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> result = leaders(nums);

        System.out.println(result);
    }
}
