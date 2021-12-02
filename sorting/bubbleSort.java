import java.util.concurrent.ForkJoinPool;

public class bubbleSort {
    public static void PrintArr(int idx, int a[]) {
        System.out.printf("Lan %d: ", idx);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void bubbleSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            PrintArr(i, a);
            if (isSorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 6 };
        bubbleSort(arr);
    }
}
