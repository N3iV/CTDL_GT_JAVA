public class _88_MergeSortedArray {

    public static void merge(int[] n1, int m, int[] n2, int n) {
        for (int i : n2) {
            insert(i, n1, m);
            m++;
        }

    }

    public static void insert(int x, int[] a, int m) {
        boolean isCheck = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                isCheck = true;

                for (int i = m - 1; i >= k; i--) {
                    a[i + 1] = a[i];
                }
                a[k] = x;
                break;
            }
            if (isCheck == false) {
                a[m] = x;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 4, 3, 0, 0, 0 };
        int[] nums2 = { 0, 2, 6 };
        merge(nums1, 3, nums2, 3);
        System.out.println("DONE");
    }
}
