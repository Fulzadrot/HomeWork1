package HomeWork2.Lesson1.LessonTwo;

public class Main {
    public static void main(String[] args) throws Exception {
        //final  int A = 4;
        //final  int B = 4;
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "1", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"5", "6", "1", "8"}
        };
        String[][] array2 = {
                {"1", "2", "#", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };
        try{
        arrMethod(array);
        } catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }
        try {
            arrMethod(array2);
        } catch (MyArrayDataException e){
            System.out.println(e.getMessage());
        }

    }

    static void arrMethod(String[][] arr) throws MyArraySizeException {
        if (!(arr.length == 4 && arr[0].length == 4)) throw new MyArraySizeException();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(Integer.parseInt(arr[i][j]));
                throw new MyArrayDataException("Используйте при инициализации только цифры");
            }
        }
    }
}
