package HomeWork;

public class HomeWork2 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }

        int[] mas = new int[8];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = mas[i] + 3 * i;
            System.out.println(mas[i] + "");
        }
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
            System.out.println(numbers[i] + "");
            }
        int[][] twoNumbers = new int[2][2];
        for (int i = 0; i < twoNumbers.length; i++) {
            twoNumbers [i][i] = 1;
            System.out.println(twoNumbers[i][i]);
        }
        }
    }