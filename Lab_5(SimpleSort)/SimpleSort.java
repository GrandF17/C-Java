import java.util.Arrays;
import java.util.Scanner;

public class SimpleSort {

    public SimpleSort() {}

    void swapLong(long[] arrayOfLong, int i, int j) {
        long tmp = arrayOfLong[j];
        arrayOfLong[j] = arrayOfLong[i];
        arrayOfLong[i] = tmp;
    }

    void swapDouble(double[] arrayOfDouble, int i, int j) {
        double tmp = arrayOfDouble[j];
        arrayOfDouble[j] = arrayOfDouble[i];
        arrayOfDouble[i] = tmp;
    }

    void swapString(String[] arrayOfString, int i, int j) {
        String tmp = arrayOfString[j];
        arrayOfString[j] = arrayOfString[i];
        arrayOfString[i] = tmp;
    }

    void swapObject(Object[] arrayOfObj, int i, int j) {
        Object tmpObj = arrayOfObj[j];
        arrayOfObj[j] = arrayOfObj[i];
        arrayOfObj[i] = tmpObj;
    }

    void swapBoolean(Boolean[] arrayOfBool, int i, int j) {
        boolean tmpBool = arrayOfBool[j];
        arrayOfBool[j] = arrayOfBool[i];
        arrayOfBool[i] = tmpBool;
    }

    boolean choice(int i) {
        if(i == 1) System.out.println("Sort by length? Y/n?");
        if(i == 0) System.out.println("Sort by alphabet? Y/n?");
        Scanner in = new Scanner(System.in);
        String choice = in.nextLine().trim();
        return (choice.equals("Yes") || choice.equals("yes") || choice.equals("Y") || choice.equals("y"));
    }

    Object[] returning(Object[] arrayOfObj, long[] arrayOfLong, double[] arrayOfDouble, Boolean[] arrayOfBool, String[] arrayOfString) {
        if(arrayOfObj != null) {
            return arrayOfObj;
        } else {
            if(arrayOfString != null) {
                return arrayOfString;
            } else if(arrayOfLong != null) {
                return Arrays.stream(arrayOfLong).boxed().toArray(Long[]::new);
            } else if(arrayOfDouble != null) {
                return Arrays.stream(arrayOfDouble).boxed().toArray(Double[]::new);
            } else return arrayOfBool;
        }
    }

    public Object[] bubbleSort(Object[] arrayOfObj, long[] arrayOfLong, double[] arrayOfDouble, Boolean[] arrayOfBool, String[] arrayOfString, int beginIndex, int endIndex) {
        boolean byLength = false, byAlphabet = false;
        if(arrayOfString != null) {
            byLength = choice(1);
            if(!byLength) byAlphabet = choice(0);
        }
        for (int i = beginIndex; i < endIndex; i++) {
            for (int j = endIndex; j > i; j--) {
                if (arrayOfLong != null && arrayOfLong[j - 1] > arrayOfLong[j]) {
                    swapLong(arrayOfLong, j, j - 1);
                    if(arrayOfObj != null) {swapObject(arrayOfObj, j, j - 1);}
                } else if (arrayOfDouble != null && arrayOfDouble[j - 1] > arrayOfDouble[j]) {
                    swapDouble(arrayOfDouble, j, j - 1);
                    if(arrayOfObj != null) {swapObject(arrayOfObj, j, j - 1);}
                } else if (arrayOfBool != null && !arrayOfBool[j - 1] && arrayOfBool[j]) {
                    swapBoolean(arrayOfBool, j, j - 1);
                    if(arrayOfObj != null) {swapObject(arrayOfObj, j, j - 1);}
                } else if (arrayOfString != null) {
                    if (byAlphabet && arrayOfString[j - 1].compareTo(arrayOfString[j]) > 0) {
                        swapString(arrayOfString, j, j - 1);
                        if(arrayOfObj != null) {swapObject(arrayOfObj, j, j - 1);}
                    }
                    if(byLength && (arrayOfString[j - 1].length() > arrayOfString[j].length() || (arrayOfString[j - 1].length() == arrayOfString[j].length() && arrayOfString[j - 1].compareTo(arrayOfString[j]) > 0))) {
                        swapString(arrayOfString, j, j - 1);
                        if(arrayOfObj != null) {swapObject(arrayOfObj, j, j - 1);}
                    }
                }
            }
        }
        return returning(arrayOfObj, arrayOfLong, arrayOfDouble, arrayOfBool, arrayOfString);
    }

    public Object[] selectionSort(Object[] arrayOfObj, long[] arrayOfLong, double[] arrayOfDouble, Boolean[] arrayOfBool, String[] arrayOfString, int beginIndex, int endIndex) {
        boolean byLength = false, byAlphabet = false;
        if(arrayOfString != null) {
            byLength = choice(1);
            if(!byLength) byAlphabet = choice(0);
        }
        for (int left = beginIndex; left <= endIndex; left++) {
            int minInd = left;
            for (int i = left; i < endIndex + 1; i++) {
                if (arrayOfLong != null && arrayOfLong[minInd] > arrayOfLong[i]) {
                    minInd = i;
                } else if (arrayOfDouble != null && arrayOfDouble[minInd] > arrayOfDouble[i]) {
                    minInd = i;
                } else if (arrayOfBool != null && !arrayOfBool[minInd] && arrayOfBool[i]) {
                    minInd = i;
                } else if (arrayOfString != null) {
                    if (byAlphabet && arrayOfString[minInd].compareTo(arrayOfString[i]) > 0) {
                        minInd = i;
                    }
                    if(byLength && (arrayOfString[minInd].length() > arrayOfString[i].length() || (arrayOfString[minInd].length() == arrayOfString[i].length() && arrayOfString[minInd].compareTo(arrayOfString[i]) > 0))) {
                        minInd = i;
                    }
                }
            }
            if (arrayOfLong != null) {
                swapLong(arrayOfLong, left, minInd);
                if(arrayOfObj != null) {swapObject(arrayOfObj, left, minInd);}
            } else if (arrayOfDouble != null) {
                swapDouble(arrayOfDouble, left, minInd);
                if(arrayOfObj != null) {swapObject(arrayOfObj, left, minInd);}
            } else if (arrayOfBool != null) {
                swapBoolean(arrayOfBool, left, minInd);
                if(arrayOfObj != null) {swapObject(arrayOfObj, left, minInd);}
            } else if (arrayOfString != null) {
                swapString(arrayOfString, left, minInd);
                if(arrayOfObj != null) {swapObject(arrayOfObj, left, minInd);}
            }
        }
        return returning(arrayOfObj, arrayOfLong, arrayOfDouble, arrayOfBool, arrayOfString);
    }

    public Object[] insertionSort(Object[] arrayOfObj, long[] arrayOfLong, double[] arrayOfDouble, Boolean[] arrayOfBool, String[] arrayOfString, int beginIndex, int endIndex) {
        Object value = null, valueObj = null;
        boolean byLength = false, byAlphabet = false;
        if(arrayOfString != null) {
            byLength = choice(1);
            if(!byLength) byAlphabet = choice(0);
        }

        for (int left = beginIndex; left <= endIndex; left++) {
            if (arrayOfLong != null) {
                value = (Object) arrayOfLong[left];
            } else if (arrayOfDouble != null) {
                value = (Object) arrayOfDouble[left];
            } else if (arrayOfBool != null) {
                value = (Object) arrayOfBool[left];
            } else if (arrayOfString != null) {
                value = (Object) arrayOfString[left];
            }
            if(arrayOfObj != null) {valueObj = arrayOfObj[left];}

            int i = left - 1;
            for (; i >= beginIndex; i--) {
                if (arrayOfLong != null && arrayOfLong[i] > (Long) value) {
                    arrayOfLong[i + 1] = arrayOfLong[i];
                    if(arrayOfObj != null) {arrayOfObj[i + 1] = arrayOfObj[i];}
                } else if (arrayOfDouble != null && arrayOfDouble[i] > (Double) value) {
                    arrayOfDouble[i + 1] = arrayOfDouble[i];
                    if(arrayOfObj != null) {arrayOfObj[i + 1] = arrayOfObj[i];}
                } else if (arrayOfBool != null && (!arrayOfBool[i] && (Boolean) value)) {
                    arrayOfBool[i + 1] = arrayOfBool[i];
                    if(arrayOfObj != null) {arrayOfObj[i + 1] = arrayOfObj[i];}
                } else if (arrayOfString != null && byAlphabet && arrayOfString[i].compareTo((String) value) > 0) {
                    arrayOfString[i + 1] = arrayOfString[i];
                    if(arrayOfObj != null) {arrayOfObj[i + 1] = arrayOfObj[i];}
                } else if (arrayOfString != null && byLength && (arrayOfString[i].length() > value.toString().length() || (arrayOfString[i].length() == value.toString().length() && arrayOfString[i].compareTo(value.toString()) > 0))) {
                    arrayOfString[i + 1] = arrayOfString[i];
                    if(arrayOfObj != null) {arrayOfObj[i + 1] = arrayOfObj[i];}
                } else {
                    break;
                }
            }
            if (arrayOfLong != null) {
                arrayOfLong[i + 1] = (Long) value;
                if(arrayOfObj != null) {arrayOfObj[i + 1] = valueObj;}
            }else if (arrayOfDouble != null) {
                arrayOfDouble[i + 1] = (Double) value;
                if(arrayOfObj != null) {arrayOfObj[i + 1] = valueObj;}
            } else if (arrayOfBool != null) {
                arrayOfBool[i + 1] = (Boolean) value;
                if(arrayOfObj != null) {arrayOfObj[i + 1] = valueObj;}
            } else if (arrayOfString != null) {
                arrayOfString[i + 1] = (String) value;
                if(arrayOfObj != null) {arrayOfObj[i + 1] = valueObj;}
            }
        }
        return returning(arrayOfObj, arrayOfLong, arrayOfDouble, arrayOfBool, arrayOfString);
    }
}