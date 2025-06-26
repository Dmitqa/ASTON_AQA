public class MyArray {
    public static void checkArray(String[][] array) throws MyArraySizeExeption, MyArrayDataExeption {
        if (array.length != 4) {
            throw new MyArraySizeExeption("Array size not 4x4!");
        }

        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeExeption("Array size not 4x4!");
            }
        }
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sumArray += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataExeption("In cel [" + i + " " + j + "] not a digit.");
                }
            }
        }
        System.out.println("Sum of array values is " + sumArray);
    }
}
