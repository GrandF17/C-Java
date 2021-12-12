import java.lang.reflect.Array;
import java.util.Arrays;

public class TestEffectiveSort<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public TestEffectiveSort(int capacity, T... dummy) {
        if (dummy.length > 0)
            throw new IllegalArgumentException("Do not provide values for dummy argument.");
        Class<?> c = dummy.getClass().getComponentType();
        array = (T[]) Array.newInstance(c, capacity);
    }

    @Override
    public String toString() {
        return "GenSet of " + array.getClass().getComponentType().getName() + "[" + array.length + "]";
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);

        //-_Merge sort_-
        TestEffectiveSort<Integer> intSet = new TestEffectiveSort<>(size);
        System.out.println("\nMerge sort now is running...\n\n" + intSet);

        for(int i = 0; i < size; i++) {
            intSet.array[i] =  (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(intSet.array));

        intSet.array = EffectiveSort.mergeSort(intSet.array, 0, size - 1);//Here you can write any index you want
        System.out.println(Arrays.toString(intSet.array));

        //-_Heap sort_-
        TestEffectiveSort<String> stringSet = new TestEffectiveSort<>(size);
        System.out.println("\nHeap sort now is running...\n\n" + stringSet);

        String[] gen = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        for(int i = 0; i < size; i++) {
            stringSet.array[i] = (gen[(int) (Math.random() * 26)] + gen[(int) (Math.random() * 26)] + gen[(int) (Math.random() * 26)] + gen[(int) (Math.random() * 26)]);
        }
        System.out.println(Arrays.toString(stringSet.array));

        EffectiveSort.heapSort(stringSet.array, 0, size - 1);//Here you can write any index you want
        System.out.println(Arrays.toString(stringSet.array));

        //-_Quick sort_-
        TestEffectiveSort<Double> doubleSet = new TestEffectiveSort<>(size);
        System.out.println("\nQuick sort now is running...\n\n" + doubleSet);

        for(int i = 0; i < size; i++) {
            doubleSet.array[i] = (Math.random() * 23);
        }
        System.out.println(Arrays.toString(doubleSet.array));

        EffectiveSort.quickSort(doubleSet.array, 5, size - 1);//Here you can write any index you want
        System.out.println(Arrays.toString(doubleSet.array));
    }
}