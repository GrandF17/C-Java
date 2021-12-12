import java.util.Arrays;

public class TestLinSort {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]), size = 0;
        Integer[] list = new Integer[n];

        //-_LSD_-
        System.out.println("\nLSD sort is now running...\n");
        for(int i=0; i < n; i++){
            list[i]= (int) ((Math.random() * 1000) - (Math.random() * 1000));
            if(size < LinSort.getCountsOfDigits(list[i])){
                size = LinSort.getCountsOfDigits(list[i]);//size = max_size of max digit in arr
            }
        }
        System.out.println(Arrays.toString(list));
        LinSort.sortLSD(list, size, 0, 1);//here you can put any index to start and to end with
        System.out.println("Result arr: " + Arrays.toString(list));

        //-_MSD_-
        System.out.println("\nMSD sort is now running...\n");
        for(int i=0; i < n; i++){
            list[i]= (int) ((Math.random() * 1000) - (Math.random() * 1000));
            if(size < LinSort.getCountsOfDigits(list[i])){
                size = LinSort.getCountsOfDigits(list[i]);
            }
        }
        System.out.println(Arrays.toString(list));
        LinSort.sortMSD(list, size, 2, 6);//here you can put any index to start and to end with
        System.out.println("Result arr: " + Arrays.toString(list));

        //-_Counting sort_-
        System.out.println("\nCounting sort is now running...\n");
        for(int i=0; i < n; i++){
            list[i]= (int) ((Math.random() * 1000) - (Math.random() * 1000));
            if(size < LinSort.getCountsOfDigits(list[i])){
                size = LinSort.getCountsOfDigits(list[i]);
            }
        }
        System.out.println(Arrays.toString(list));
        LinSort.countSort(list, 0, list.length - 1);//here you can put any index to start and to end with
        System.out.println("Result arr: " + Arrays.toString(list));
    }
}
