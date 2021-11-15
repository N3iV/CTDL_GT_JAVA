package Array;
public class _1295_FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int a[] = { 1, 222224, 444442, 44, 2 };
        int kq = findNumbers(a);
        System.out.println(kq);
    }

    public static int findNumbers(int[] nums) {

        int dem = 0;
        for (int i = 0; i < nums.length; i++) {
            int soLuongChuSo = tinhSoChuSo(nums[i]);
            if (soLuongChuSo % 2 == 0) {
                dem++;
            }
        }
        return dem;
    }

    public static int tinhSoChuSo(int a) {

        int dem = 0;

        while (a != 0) {
            int kq = a / 10;
            a = kq;
            dem++;
        }

        return dem;
    }
}
// fix