import java.util.Arrays;

public class SortInJava {
    static class Student implements Comparable {
        int age;
        String name;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" + "age=" + age + ", name=" + name + '\'' + "}";
        }

        @Override
        public int compareTo(Object other) {
            // so sanh this and other
            Student otherStudent = (Student) other;
            // 0 neu this = other
            // 1 neu this > other
            // -1 neu this< other
            if (this.age == otherStudent.age) {
                return 0;
            } else if (this.age > otherStudent.age)
                return 1;
            return -1;
        }
    }

    public static void main(String[] args) {

        // #1 Sort an Integer Arr - Kieu nguyen thuy
        int[] intArray = { 3, 2, 1, 12 };
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        // #2 Sort an String array
        String[] stringArr = { "1", "00000", "22" };
        Arrays.sort(stringArr);
        System.out.println(Arrays.toString(stringArr)); // 00000 1 22

        // #3 Sort an Student Array with interface comparable

        Student[] students = { new Student("AAAA", 20), new Student("BBBB", 10) };
        Arrays.sort(students);
        System.out.println(Arrays.toString(students)); // 00000 1 22
    }

}
