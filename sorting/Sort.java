import java.util.concurrent.ForkJoinPool;

public class Sort {
    public static void PrintArr(int idx, int a[]) {
        System.out.printf("Lan %d: ", idx);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void insertionSort(int a[]) {
        System.out.println("INSERTION SORT");
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
            PrintArr(i, a);
        }
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

    public static void SelectionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }

            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;

            }
            PrintArr(i, a);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 3, 2, 7, 8, 1, 2 };
        // bubbleSort(arr);
        // insertionSort(arr);
        SelectionSort(arr);
    }
}
