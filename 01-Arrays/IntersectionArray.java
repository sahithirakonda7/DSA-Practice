import java.util.*;

public class IntersectionArray {

    public static int[] intersectionArray(int[] nums1, int[] nums2) {

        ArrayList<Integer> res = new ArrayList<>();

        boolean[] visited = new boolean[nums2.length];

        for(int i = 0; i < nums1.length; i++) {

            for(int j = 0; j < nums2.length; j++) {

                if(nums1[i] == nums2[j] && !visited[j]) {

                    res.add(nums1[i]);
                    visited[j] = true;
                    break;
                }
            }
        }

        int[] result = new int[res.size()];

        for(int k = 0; k < res.size(); k++) {
            result[k] = res.get(k);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n = sc.nextInt();

        int[] nums1 = new int[n];

        System.out.println("Enter elements of first array:");
        for(int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        System.out.println("Enter size of second array:");
        int m = sc.nextInt();

        int[] nums2 = new int[m];

        System.out.println("Enter elements of second array:");
        for(int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }

        int[] result = intersectionArray(nums1, nums2);

        System.out.println("Intersection array:");

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}