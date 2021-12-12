import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class LinSort {
    public static int getCountsOfDigits(int number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int getNthDigit(int number, int n) {
        return (int) ((number / Math.pow(10, n - 1)) % 10);
    }

    public static void countSort(Integer[] list, int beginIndex, int endIndex) {
        int min, max;
        max = min = list[beginIndex];
        for (int i = beginIndex + 1; i <= endIndex; i++) {
            if (list[i] < min) {
                min = list[i];
            }
            if (list[i] > max) {
                max = list[i];
            }
        }
        sort(list, beginIndex, endIndex, min, max);
    }

    private static void sort(Integer[] list, int beginIndex, int endIndex, int min, int max) {
        int[] count = new int[max - min + 1];
        for (int i = beginIndex; i <= endIndex; i++) {
            count[list[i] - min]++;
        }
        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                list[idx++] = i + min;
            }
        }
    }

    public static void sortLSD(Integer[] list, int size, int beginIndex, int endIndex){
        for(int k = 1; k <= size ; k++) {
            for (int i = beginIndex; i <= endIndex; i++) {
                for (int j = endIndex; j > i; j--) {
                    if (getNthDigit(list[j - 1], k) > getNthDigit(list[j], k)) {
                        int temp = list[j - 1];
                        list[j - 1] = list[j];
                        list[j] = temp;
                    }
                }
            }
        }
    }

    public static void sortMSD(Integer[] list, int size, int beginIndex, int endIndex){
        for (int i = beginIndex; i <= endIndex; i++) {
            for (int j = endIndex; j > i; j--) {
                if (getNthDigit(list[j - 1], size) > getNthDigit(list[j], size)) {
                    int temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }

        int idx = getNthDigit(list[beginIndex], size);
        int begin = beginIndex;
        int end;
        for(int i = beginIndex; i <= endIndex; i++) {
            if(idx < getNthDigit(list[i], size)) {
                end = i - 1;
                sortMSD(list, size - 1, begin, end);
                begin = i;
                idx = getNthDigit(list[i], size);
            }
        }
    }
}