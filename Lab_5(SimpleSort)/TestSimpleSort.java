import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestSimpleSort {
    public static void main (String []args) {
        SimpleSort simpleSort = new SimpleSort();
        int beginIndex = 0, endIndex = 0;
        while(true) {
            System.out.println("Choose what kind of array you want to fill:\n" +
                    "1 - array on int/long\n" +
                    "2 - array on float/double\n" +
                    "3 - array on String\n" +
                    "4 - array on Boolean\n" +
                    "5 - array on Objects\n");
            Scanner in = new Scanner(System.in);
            Scanner inNew = new Scanner(System.in);
            switch(in.nextInt()) {
                case 1:
                    System.out.println("Pls enter length of your array (long): ");
                    long[] arrayOfLong = new long[in.nextInt()];
                    for(int i = 0; i < arrayOfLong.length; i++) {
                        System.out.println("array[ " + (i + 1) + " ] = ");
                        arrayOfLong[i] = in.nextLong();
                    }
                    System.out.println("Enter beginning index:");
                    beginIndex = in.nextInt();
                    System.out.println("Enter ending index:");
                    endIndex = in.nextInt();
                    System.out.println("Your unsorted mass: " + Arrays.toString(arrayOfLong) +
                                       "\nChoose how to sort?\n" +
                                       "1 - bubble sort\n" +
                                       "2 - selection sort\n" +
                                       "3 - insertion sort\n");
                    switch (in.nextInt()) {
                        case 1:
                            for(int i = 0; i < arrayOfLong.length; i++)
                                arrayOfLong[i] =  Long.parseLong((simpleSort.bubbleSort(null, arrayOfLong, null, null, null,  beginIndex, endIndex)[i].toString()));
                            break;
                        case 2:
                            for(int i = 0; i < arrayOfLong.length; i++)
                                arrayOfLong[i] =  Long.parseLong((simpleSort.selectionSort(null, arrayOfLong, null, null, null,  beginIndex, endIndex)[i].toString()));
                            break;
                        case 3:
                            for(int i = 0; i < arrayOfLong.length; i++)
                                arrayOfLong[i] =  Long.parseLong((simpleSort.insertionSort(null, arrayOfLong, null, null, null,  beginIndex, endIndex)[i].toString()));
                            break;
                    }
                    System.out.println(Arrays.toString(arrayOfLong));
                    break;
                case 2:
                    System.out.println("Pls enter length of your array (double): ");
                    double[] arrayOfDouble = new double[in.nextInt()];
                    for(int i = 0; i < arrayOfDouble.length; i++) {
                        System.out.println("array[ " + (i + 1) + " ] = ");
                        arrayOfDouble[i] = in.nextDouble();
                    }
                    System.out.println("Enter beginning index:");
                    beginIndex = in.nextInt();
                    System.out.println("Enter ending index:");
                    endIndex = in.nextInt();
                    System.out.println("Your unsorted mass: " + Arrays.toString(arrayOfDouble) +
                            "\nChoose how to sort?\n" +
                            "1 - bubble sort\n" +
                            "2 - selection sort\n" +
                            "3 - insertion sort\n");
                    switch (in.nextInt()) {
                        case 1:
                            for(int i = 0; i < arrayOfDouble.length; i++)
                                arrayOfDouble[i] =  Double.parseDouble((simpleSort.bubbleSort(null, null, arrayOfDouble, null, null,  beginIndex, endIndex)[i].toString()));
                            break;
                        case 2:
                            for(int i = 0; i < arrayOfDouble.length; i++)
                                arrayOfDouble[i] =  Double.parseDouble((simpleSort.selectionSort(null, null, arrayOfDouble, null, null,  beginIndex, endIndex)[i].toString()));
                            break;
                        case 3:
                            for(int i = 0; i < arrayOfDouble.length; i++)
                                arrayOfDouble[i] =  Double.parseDouble((simpleSort.insertionSort(null, null, arrayOfDouble, null, null,  beginIndex, endIndex)[i].toString()));
                            break;
                    }
                    System.out.println(Arrays.toString(arrayOfDouble));
                    break;
                case 3:
                    System.out.println("Pls enter length of your array (String): ");
                    String[] arrayOfString = new String[in.nextInt()];
                    for(int i = 0; i < arrayOfString.length; i++) {
                        System.out.println("array[ " + (i + 1) + " ] = ");
                        arrayOfString[i] = inNew.nextLine();
                    }
                    System.out.println("Enter beginning index:");
                    beginIndex = in.nextInt();
                    System.out.println("Enter ending index:");
                    endIndex = in.nextInt();
                    System.out.println("Your unsorted mass: " + Arrays.toString(arrayOfString) +
                            "\nChoose how to sort?\n" +
                            "1 - bubble sort\n" +
                            "2 - selection sort\n" +
                            "3 - insertion sort\n");
                    switch (in.nextInt()) {
                        case 1:
                            arrayOfString = (String[]) simpleSort.bubbleSort(null, null, null, null, arrayOfString,  beginIndex, endIndex);
                            break;
                        case 2:
                            arrayOfString = (String[]) simpleSort.selectionSort(null, null, null, null, arrayOfString,  beginIndex, endIndex);
                            break;
                        case 3:
                            arrayOfString = (String[]) simpleSort.insertionSort(null, null, null, null, arrayOfString,  beginIndex, endIndex);
                            break;
                    }
                    ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arrayOfString));
                    System.out.println(arrayList);
                    break;
                case 4:
                    System.out.println("Pls enter length of your array (Boolean): ");
                    Boolean[] arrayOfBool = new Boolean[in.nextInt()];
                    for(int i = 0; i < arrayOfBool.length; i++) {
                        System.out.println("array[ " + (i + 1) + " ] = ");
                        arrayOfBool[i] = in.nextBoolean();
                    }
                    System.out.println("Enter beginning index:");
                    beginIndex = in.nextInt();
                    System.out.println("Enter ending index:");
                    endIndex = in.nextInt();
                    System.out.println("Your unsorted mass: " + Arrays.toString(arrayOfBool) +
                            "\nChoose how to sort?\n" +
                            "1 - bubble sort\n" +
                            "2 - selection sort\n" +
                            "3 - insertion sort\n");
                    switch (in.nextInt()) {
                        case 1:
                            for(int i = 0; i < arrayOfBool.length; i++) {
                                arrayOfBool[i] =  Boolean.parseBoolean((simpleSort.bubbleSort(null, null, null, arrayOfBool, null,  beginIndex, endIndex)[i].toString()));
                            }
                            break;
                        case 2:
                            for(int i = 0; i < arrayOfBool.length; i++) {
                                arrayOfBool[i] =  Boolean.parseBoolean((simpleSort.selectionSort(null, null, null, arrayOfBool, null,  beginIndex, endIndex)[i].toString()));
                            }
                            break;
                        case 3:
                            for(int i = 0; i < arrayOfBool.length; i++) {
                                arrayOfBool[i] =  Boolean.parseBoolean((simpleSort.insertionSort(null, null, null, arrayOfBool, null,  beginIndex, endIndex)[i].toString()));
                            }
                            break;
                    }
                    System.out.println(Arrays.toString(arrayOfBool));
                    break;
                case 5:
                    System.out.println("Pls enter length of your array (Object): ");
                    SomeClass[] arrayOfObj = new SomeClass[in.nextInt()];
                    for(int i = 0; i < arrayOfObj.length; i++) {
                        System.out.println("array[ " + (i + 1) + " ] = ");
                        System.out.println("Enter a (long), b (String) and c (Boolean) divided by Enter:\n");
                        arrayOfObj[i] = new SomeClass(in.nextLong(), inNew.nextLine(), in.nextBoolean());
                        arrayOfObj[i].getDeclaredFields();
                    }
                    System.out.println("Enter beginning index:");
                    beginIndex = in.nextInt();
                    System.out.println("Enter ending index:");
                    endIndex = in.nextInt();
                    System.out.println("Your unsorted mass: " + Arrays.toString(arrayOfObj) +
                            "\nChoose how to sort:\n" +
                            "1 - bubble sort\n" +
                            "2 - selection sort\n" +
                            "3 - insertion sort\n");
                    switch (in.nextInt()) {
                        case 1:
                            System.out.println(Arrays.toString(arrayOfObj));
                            System.out.println("1 - sort by a (long)\n2 - sort by b (String)\n3 - sort by c (Boolean)\n");
                            if(in.nextInt() == 1) {
                                long[] arrayNew = new long[arrayOfObj.length];
                                for(int i = 0; i < arrayOfObj.length; i++) {
                                    arrayNew[i] = arrayOfObj[i].a;
                                }
                                System.out.println(Arrays.toString(arrayNew));
                                arrayOfObj = (SomeClass[]) simpleSort.bubbleSort(arrayOfObj, arrayNew, null, null, null,  beginIndex, endIndex);
                            } else if(in.nextInt() == 2) {
                                String[] arrayNew = new String[arrayOfObj.length];
                                for(int i = 0; i < arrayOfObj.length; i++) {
                                    arrayNew[i] = arrayOfObj[i].b;
                                }
                                System.out.println(Arrays.toString(arrayNew));
                                arrayOfObj = (SomeClass[]) simpleSort.bubbleSort(arrayOfObj, null, null, null, arrayNew, beginIndex, endIndex);
                            } else if(in.nextInt() == 3) {
                                Boolean[] arrayNew = new Boolean[arrayOfObj.length];
                                for(int i = 0; i < arrayOfObj.length; i++) {
                                    arrayNew[i] = arrayOfObj[i].c;
                                }
                                System.out.println(Arrays.toString(arrayNew));
                                arrayOfObj = (SomeClass[]) simpleSort.bubbleSort(arrayOfObj, null, null, arrayNew, null, beginIndex, endIndex);
                            }
                            break;
                        case 2:
                            System.out.println(Arrays.toString(arrayOfObj));
                            System.out.println("1 - sort by a (long)\n2 - sort by b (String)\n3 - sort by c (Boolean)\n");
                            if(in.nextInt() == 1) {
                                long[] arrayNew = new long[arrayOfObj.length];
                                for(int i = 0; i < arrayOfObj.length; i++) {
                                    arrayNew[i] = arrayOfObj[i].a;
                                }
                                System.out.println(Arrays.toString(arrayNew));
                                arrayOfObj = (SomeClass[]) simpleSort.selectionSort(arrayOfObj, arrayNew, null, null, null,  beginIndex, endIndex);
                            } else if(in.nextInt() == 2) {
                                String[] arrayNew = new String[arrayOfObj.length];
                                for(int i = 0; i < arrayOfObj.length; i++) {
                                    arrayNew[i] = arrayOfObj[i].b;
                                }
                                System.out.println(Arrays.toString(arrayNew));
                                arrayOfObj = (SomeClass[]) simpleSort.selectionSort(arrayOfObj, null, null, null, arrayNew, beginIndex, endIndex);
                            } else if(in.nextInt() == 3) {
                                Boolean[] arrayNew = new Boolean[arrayOfObj.length];
                                for(int i = 0; i < arrayOfObj.length; i++) {
                                    arrayNew[i] = arrayOfObj[i].c;
                                }
                                System.out.println(Arrays.toString(arrayNew));
                                arrayOfObj = (SomeClass[]) simpleSort.selectionSort(arrayOfObj, null, null, arrayNew, null, beginIndex, endIndex);
                            }
                            break;
                        case 3:
                            System.out.println(Arrays.toString(arrayOfObj));
                            System.out.println("1 - sort by a (long)\n2 - sort by b (String)\n3 - sort by c (Boolean)\n");
                            if(in.nextInt() == 1) {
                                long[] arrayNew = new long[arrayOfObj.length];
                                for(int i = 0; i < arrayOfObj.length; i++) {
                                    arrayNew[i] = arrayOfObj[i].a;
                                }
                                System.out.println(Arrays.toString(arrayNew));
                                arrayOfObj = (SomeClass[]) simpleSort.insertionSort(arrayOfObj, arrayNew, null, null, null,  beginIndex, endIndex);
                            } else if(in.nextInt() == 2) {
                                String[] arrayNew = new String[arrayOfObj.length];
                                for(int i = 0; i < arrayOfObj.length; i++) {
                                    arrayNew[i] = arrayOfObj[i].b;
                                }
                                System.out.println(Arrays.toString(arrayNew));
                                arrayOfObj = (SomeClass[]) simpleSort.insertionSort(arrayOfObj, null, null, null, arrayNew, beginIndex, endIndex);
                            } else if(in.nextInt() == 3) {
                                Boolean[] arrayNew = new Boolean[arrayOfObj.length];
                                for(int i = 0; i < arrayOfObj.length; i++) {
                                    arrayNew[i] = arrayOfObj[i].c;
                                }
                                System.out.println(Arrays.toString(arrayNew));
                                arrayOfObj = (SomeClass[]) simpleSort.insertionSort(arrayOfObj, null, null, arrayNew, null, beginIndex, endIndex);
                            }
                            break;
                    }
                    System.out.println(Arrays.toString(arrayOfObj));
                    break;
            }
        }
    }
}

/*
long[] array = {9, 2, 1, 42143, 3, 10, 9999, 11, 10, 0};
        double[] arrayOfDoubles = {9.1, 0.2, 0.1, 421.43, 3.8, 1.01, 999.9, 1.1, 1.02};
        Boolean[] arrayOfBool = {true, false, true, false, false, true};

        //String stringToConvert = String.valueOf(o);
        //Long convertedLong = Long.parseLong(stringToConvert);

//-_-_-_-_-_-_-long sort-_-_-_-_-_-_-
        for(int i = 0; i < array.length; i++) {
        array[i] =  Long.parseLong((simpleSort.insertionSort(null, array, null, null, null,  0, 9)[i].toString()));
        }
        System.out.println(Arrays.toString(array));
        //-_-_-_-_-_-_-long sort-_-_-_-_-_-_-

        //-_-_-_-_-_-_-double sort-_-_-_-_-_-_-
        for(int i = 0; i < arrayOfDoubles.length; i++) {
        arrayOfDoubles[i] =  Double.parseDouble((simpleSort.insertionSort(null, null, arrayOfDoubles, null, null,  0, 8)[i].toString()));
        }
        System.out.println(Arrays.toString(arrayOfDoubles));
        //-_-_-_-_-_-_-double sort-_-_-_-_-_-_-

        //-_-_-_-_-_-_-boolean sort-_-_-_-_-_-_-
        for(int i = 0; i < arrayOfBool.length; i++) {
        arrayOfBool[i] =  Boolean.parseBoolean((simpleSort.insertionSort(null, null, null, arrayOfBool, null,  0, 5)[i].toString()));
        }
        System.out.println(Arrays.toString(arrayOfBool));
        //-_-_-_-_-_-_-boolean sort-_-_-_-_-_-_-

        //-_-_-_-_-_-_-string sort-_-_-_-_-_-_-
        String[] arrayNew = {"red", "blue", "white", "yellow", "pink"};

        arrayNew = (String[]) simpleSort.insertionSort(null, null, null, null, arrayNew,  0, 4);
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(arrayNew));
        System.out.println(arrayList);
        //-_-_-_-_-_-_-string sort-_-_-_-_-_-_-

        //-_-_-_-_-_-_-object sort-_-_-_-_-_-_-
        SomeClass t1 = new SomeClass(1, "Loh", true);
        SomeClass t2 = new SomeClass(10, "NeLoh", false);
        SomeClass t3 = new SomeClass(2, "Arbidol", false);
        SomeClass t4 = new SomeClass(5, "Keker", true);

        int choice = 3;
        Object[] arrayNewO = {t1, t2, t3, t4};
        System.out.println(Arrays.toString(arrayNewO));
        if(choice == 1) {
        long[] arrayNew1 = {t1.a, t2.a, t3.a, t4.a};
        System.out.println(Arrays.toString(arrayNew1));
        arrayNewO = simpleSort.insertionSort(arrayNewO, arrayNew1, null, null, null,  0, 3);
        System.out.println(Arrays.toString(arrayNewO));
        } else if(choice == 2) {
        String[] arrayNew1 = {t1.b, t2.b, t3.b, t4.b};
        System.out.println(Arrays.toString(arrayNew1));
        arrayNewO = simpleSort.insertionSort(arrayNewO, null, null, null, arrayNew1, 0, 3);
        System.out.println(Arrays.toString(arrayNewO));
        } else if(choice == 3) {
        Boolean[] arrayNew1 = {t1.c, t2.c, t3.c, t4.c};
        System.out.println(Arrays.toString(arrayNew1));
        arrayNewO = simpleSort.insertionSort(arrayNewO, null, null, arrayNew1, null, 0, 3);
        System.out.println(Arrays.toString(arrayNewO));
        }
        //-_-_-_-_-_-_-object sort-_-_-_-_-_-_-
 */