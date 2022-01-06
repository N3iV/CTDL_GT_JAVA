import java.util.Arrays;

public class MergeSort {
    public int[] merge2Array(int[] a1, int a2[]) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) { // a1 & a2 !== rong
                if (a1[i1] < a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;
    }

    public int[] mergeSort(int[] a, int L, int R) {

        if (L == R) {
            int[] singleEl = { a[L] };
            return singleEl;
        }
        // Chia ra
        int k = (L + R) / 2;
        int[] a1 = mergeSort(a, L, k);
        int[] a2 = mergeSort(a, k + 1, R);
        // Tron vao
        int[] result = merge2Array(a1, a2);
        return result;
    }

    public int[] sort(int[] a) {
        return mergeSort(a, 0, a.length - 1);
    }

    public static void main(String[] args) {
        MergeSort s = new MergeSort();
        int[] b = { 1, 3, 5, 6 };
        int[] c = { 2, 4, 7, 9 };
        System.out.println(Arrays.toString(s.merge2Array(b, c)));
        // int[] a = { 1, 5, 3, 2, 8, 7, 6, 4 };
        // System.out.println(Arrays.toString(s.sort(a)));
    }
}
