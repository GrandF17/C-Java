import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class MyVector {
    static Object[] arr;
    static int size;
    static int max_size;

    public MyVector () {
        max_size = 2 * size + 10;
        arr = new Object[max_size];
    }

    static void printArr() {
        ArrayList<Object> arrayList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(arrayList);
    }

    static void  changeCapacity(int newSize) {
        Object[] temp = new Object[size];
        if (size >= 0) System.arraycopy(arr, 0, temp, 0, size);
        max_size = newSize;
        arr = new Object[max_size];
        if (size >= 0 && newSize >= 0) System.arraycopy(temp, 0, arr, 0, Math.min(size, newSize));
    }

    static Object scanner() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an object to add:");
        return in.nextLine();
    }

    static void append() {
        arr[size++] = scanner();
    }

    static void removeLast() {
        if(size > 0) arr[--size] = null;
    }

    static void clearArr() {
        while(size > 0) {
            removeLast();
        }
    }

    static void removeById(int index) {
        if (size - index >= 0) System.arraycopy(arr, index + 1, arr, index, size - index);
        //this string we can write in other way:
        //for(int i = index; i < size; i++) {
        //    arr[i] = arr[i + 1];
        size--;
    }

    static void addById(int index) {
        if (size - index >= 0) System.arraycopy(arr, index, arr, index + 1, size - index);
        //this string we can write in other way:
        //for(int i = index; i < size; i++)
        //    arr[i + 1] = arr[i];
        arr[index] = scanner();
        size++;
    }
}