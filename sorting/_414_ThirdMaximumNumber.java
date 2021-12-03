public class _414_ThirdMaximumNumber {

    public static void print(long[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("\t" + a[i]);
        }
        System.out.println();
    }

    public static void insert(long[] a, int val) {
        int i = 0;
        while (i < a.length) {
            if (val == a[i]) {
                return;
            } else if (val > a[i]) {

                break;
            } else {
                i++;
            }
        }
        if (i < a.length) {
            for (int j = a.length - 2; j >= i; j--) {
                a[j + 1] = a[j];
            }
            a[i] = val;
            // print(a);
        }
    }

    public static int thirdMax(int[] a) {
        long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };

        for (int i = 0; i < a.length; i++) {
            insert(maxArr, a[i]);
        }
        if (maxArr[2] == Long.MIN_VALUE)
            return (int) maxArr[0];

        return (int) maxArr[2];
    }

    public static void main(String[] args) {
        int[] a = { 2, 2, 3, 1 };
        System.out.println(thirdMax(a));
    }
}
