public class search {
    public static int bSearchFor(int[] a, int key) {

        int n = a.length;
        int iLeft = 0;
        int iRight = n - 1;
        int iMid = (iLeft + iRight) / 2;
        while (iLeft <= iRight) {
            if (key == a[iMid])
                return iMid;
            else if (key > a[iMid]) {
                iLeft = iMid + 1;
            } else
                iRight = iMid - 1;
        }
        return -1;
    }

    public static int bSearchRecursion(int[] a, int key, int iLeft, int iRight) {
        if (iLeft > iRight)
            return -1;
        int iMid = (iLeft + iRight) / 2;
        if (key == a[iMid])
            return iMid;
        else if (key > a[iMid])
            return bSearchRecursion(a, key, iMid + 1, iRight);
        else
            return bSearchRecursion(a, key, iLeft, iMid - 1);
    }

    public static int binarySearchRecursion(int[] a, int key) {
        int n = a.length;
        return bSearchRecursion(a, key, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 7, 8, 9, 12, 23, 43 };
        int result = bSearchFor(a, 8);
        System.out.println(result);
        int resultRecursion = binarySearchRecursion(a, 8);
        System.out.println(resultRecursion);
    }
}
