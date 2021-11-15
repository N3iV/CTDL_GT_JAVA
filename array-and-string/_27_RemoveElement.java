public class _27_RemoveElement {
    public static void main(String[] args) {
        int a[] = { 2, 3, 3, 4, 3, 3, 2 };
        System.out.println(removeElement(a, 3));
        System.out.println("DONE");
    }

    public static int removeElement(int[] a, int val) {
        int n = a.length;

        for (int i = 0; i < n;) {
            if (a[i] == val) {
                // xoa a[i]
                for (int j = i; j <= n - 2; j++) {
                    a[j] = a[j + 1];

                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
