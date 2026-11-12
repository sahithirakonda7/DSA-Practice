import java.util.*;

class UnionArray {

    public static int[] unionArray(int[] nums1, int[] nums2) {

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!res.contains(nums1[i])) {
                res.add(nums1[i]);
            }
        }

        for (int j = 0; j < nums2.length; j++) {
            if (!res.contains(nums2[j])) {
                res.add(nums2[j]);
            }
        }

        int[] result = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums1 = new int[n];

        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] nums2 = new int[m];

        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = unionArray(nums1, nums2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
}