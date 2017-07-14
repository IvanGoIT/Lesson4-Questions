import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by IvanD on 7/14/2017.
 */
public class Array {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int arraySize = sc.nextInt();

        System.out.println("Введите массив");
        int[] array = new int[arraySize];
        for(int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int findMaxNumber(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int findMaxRepeatNumbers(int[] array) {
        int numberOfMaxRepeats = findNumberOfMaxRepeats(array);
        int repeats = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] == numberOfMaxRepeats) {
                repeats++;
            }
        }
        return repeats;
    }

    public static int findRepeatsOfMaxNumber(int[] array) {
        int maxNumber = findMaxNumber(array);
        int repeats = 0;

        for(int element : array) {
            if (maxNumber == element) {
                repeats++;
            }
        }
        return repeats;
    }

    public static int findNumberOfMaxRepeats(int[] array) {
        Arrays.sort(array);

        int maxRepeats = 1;
        int repeats = 1;
        int maxRepeatsNumber = array[0];

        for(int i = 1; i < array.length; i++) {
            if (array[i-1] == array[i]) {
                repeats++;

                if (maxRepeats < repeats) {
                    maxRepeats = repeats;
                    maxRepeatsNumber = array[i];
                }
            } else {
                repeats = 1;
            }
        }
        return maxRepeatsNumber;
    }

    public static void main(String[] args) {
        int[] array = inputArray();

        System.out.println("Максимум = " + findMaxNumber(array));
        System.out.print("Макс. кол-во повторений = " + findMaxRepeatNumbers(array));
        System.out.println(" числа = " + findNumberOfMaxRepeats(array));
        System.out.println("Кол-во повторений макс. числа = " + findRepeatsOfMaxNumber(array));
    }
}
