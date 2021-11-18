public class SampleString {
    public static void main(String[] args) {
        String s1 = "Hello World! 1  2  3";
        String s2 = new String("Hi Vien");
        System.out.println(s2);
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            // System.out.print(s1.charAt(i) + " ");

            // ----- TIM KI TU IN HOA ---- //
            // if (Character.isUpperCase(c)) {
            // System.out.println(c);
            // }

            // ----- TIM SO-----//
            if (Character.isDigit(c)) {
                System.out.print(c + " ");
            }
        }
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c > 48 && c < 57) {
                System.out.print(c + " ");
            }
        }
        char ch = 'A';
        System.out.println("\n" + ch + " Co ma ASCII la: " + (int) ch);

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println("str1==str2: " + (str1 == str2)); // true
        System.out.println("str2==str3: " + (str2 == str3)); // false
        System.out.println("str1==str3: " + (str1 == str3)); // false

        System.out.println("str1==str2: " + (str1.equals(str2))); // true
        System.out.println("str2==str3: " + (str2.equals(str3))); // true
        System.out.println("str1==str3: " + (str1.equals(str3))); // true

    }
}