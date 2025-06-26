public class Lesson_6 {
    public static void main(String[] args) {
        String[][] arr1 = {{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
        String[][] arr2 = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {}, {}};
        String[][] arr3 = {{"1", "1", "1", "1"}, {"2", "2", "2", "bug"}, {"3", "3", "3", "3"}, {"A", "4", "4", "4"}};

        try {
            MyArray.checkArray(arr1);
        } catch (MyArraySizeExeption e) {
            System.out.println("Invalid size: " + e.getMessage());
        } catch (MyArrayDataExeption e) {
            System.out.println("Invalid data: " + e.getMessage());
        }

        try {
            MyArray.checkArray(arr2);
        } catch (MyArraySizeExeption e) {
            System.out.println("Invalid size: " + e.getMessage());
        } catch (MyArrayDataExeption e) {
            System.out.println("Invalid data: " + e.getMessage());
        }

        try {
            MyArray.checkArray(arr3);
        } catch (MyArraySizeExeption e) {
            System.out.println("Invalid size: " + e.getMessage());
        } catch (MyArrayDataExeption e) {
            System.out.println("Invalid data: " + e.getMessage());
        }
    }
}
