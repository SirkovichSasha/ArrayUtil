package arrays;

import javax.swing.*;
import java.util.*;

public class ArrayUtil {

    public static void fill(int[] array, Scanner scanner) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public static void fillRandom(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber(min, max);
        }
    }

    public static int getRandomNumber(int min, int max) {
        return new Random().nextInt(max - min) + min;
        //return (int) (Math.random()*(max - min))+min;
    }

    public static String toString(int[] array) {
        StringBuilder json = new StringBuilder("[");
        boolean has = false;
        for (int i = 0; i < array.length; i++) {
            if (has)
                json.append(", ");
            json.append(array[i]);
            has = true;
        }
        json.append("]");
        return json.toString();
        //return Arrays.toString(array);
    }

    public static String evenIndexes(int[] array) {
        boolean has = false;
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < array.length; i += 2) {
            if (has)
                json.append(", ");
            json.append(array[i]);
            has = true;
        }
        json.append("]");
        return json.toString();
        
    }

    public static String evenData(int[] array) {
        boolean has = false;
        StringBuilder json = new StringBuilder("[");
        for (int i = 0; i < array.length; i += 2) {
            int num = array[i];
            if (!isEven(num)) continue;
            if (has)
                json.append(", ");
            json.append(num);
            has = true;
        }
        json.append("]");
        return json.toString();
    }

    public static ArrayList<Integer> evenData2(int[] array) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < array.length; i += 2) {
            int num = array[i];
            if (!isEven(num)) continue;
            evenNumbers.add(num);
        }
        return evenNumbers;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) return true;
        return false;
    }

    public static void greaterNeighbours(int[] array) {
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                count++;
                i++;
            }
        }
        System.out.println("greaterNeighbours : " + count);
    }

    public static void max(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        System.out.println("max : " + max);
    }

    public static int[] maxValues(int[] array) {
        int max = Integer.MIN_VALUE;
        StringBuilder json = new StringBuilder("[ ");
        boolean has = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) continue;

            if (array[i] > max) {
                max = array[i];
                json.delete(0, json.length());
                has = false;
            }
            if (has)
                json.append(", ");
            json.append(i);
            has = true;
        }
        return json.chars().toArray();
    }

    public static ArrayList<Integer> maxValues2(int[] array) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> maxValues = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) continue;
            if (array[i] > max) {
                max = array[i];
                maxValues.clear();
            }
            maxValues.add(i);
        }
        return maxValues;
    }


    public static int minOdd(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (isEven(num)) continue;
            if (num < min)
                min = num;
        }
        return min;
    }


}



