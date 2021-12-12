import java.util.Scanner;

public class TestVector {


    public static void main(String[] args) {
        MyVector.size = Integer.parseInt(args[0]);
        MyVector t1 = new MyVector();
        for(int i = 0; i < MyVector.size; i++)
            MyVector.arr[i] = i + 1;

        while(true) {
            MyVector.printArr();
            System.out.println("""
                    1 - add in the end
                    2 - delete last
                    3 - delete by index
                    4 - add by index
                    5 - change array's size
                    6 - delete array
                    7 - to know size & max size
                    """);
            Scanner in = new Scanner(System.in);
            switch(in.nextInt()) {
                case 1:
                    if (MyVector.size == MyVector.max_size) MyVector.changeCapacity((MyVector.size * 3) / 2 + 1);
                    MyVector.append();
                    break;
                case 2: MyVector.removeLast(); break;
                case 3:
                    MyVector.removeById(in.nextInt()); break;
                case 4:
                    if (MyVector.size == MyVector.max_size) MyVector.changeCapacity((MyVector.size * 3) / 2 + 1);
                    MyVector.addById(in.nextInt());
                    break;
                case 5: MyVector.changeCapacity(in.nextInt()); break;
                case 6: MyVector.clearArr(); break;
                case 7: System.out.println("Size = " + MyVector.size + "\nMax Size = " + MyVector.max_size); break;
            }
        }
    }
}