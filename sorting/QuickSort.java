import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] a, int L, int R) {
        if (L >= R)
            return;
        // B1: Chon khoa
        int key = a[(L + R) / 2];
        // B2: Phan bo lai mang
        int k = partition(a, L, R, key);
        System.out.println("L=" + L + " R= " + R + " key=" + key + " k= " + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, L, R + 1)));
        System.out.println("==============");
        // B3: Chia doi mang => Lai lai
        quickSort(a, L, k - 1);
        quickSort(a, k, R);
    }

    // Return pivot value
    static int partition(int[] a, int L, int R, int key) {
        int iL = L;
        int iR = R;
        while (iL <= iR) {
            // voi iL tim phan tu >= key de doi cho
            while (a[iL] < key)
                iL++;
            // voi iR tim phan tu <= key de doi cho
            while (a[iR] > key)
                iR--;
            // Đổi chỗ cho 2 phần tử đang đứng không đúng vị trí
            if (iL <= iR) {
                int tmp = a[iL];
                a[iL] = a[iR];
                a[iR] = tmp;
                iL++;
                iR--;
            }
        }
        return iL;
    }

    public static void main(String[] args) {
        int[] a = { 6, 7, 8, 5, 4, 1, 2, 3 };
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
