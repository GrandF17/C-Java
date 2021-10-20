import java.util.Scanner;

public class TestList {
    public static void main(String[] args) {
        //generate and print our LinkedList
        int n;
        String a;
        MyList l = new MyList();
        n = Integer.parseInt(args[0]);
        for(int i = 0; i<=n; i++){
            a = Integer.toString(i);
            l.addBack(a);
        }
        l.printList();

        //choose what to do with our LinkedList
        while(n != 0)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("1 - add smth at the beginning of the LinkedList (LL)\n" +
                    "2 - add smth at the end of the LL\n"+
                    "3 - delete 1-st element from the LL\n"+
                    "4 - delete certain element  from the LL:\n"+
                    "5 - how many elements in LL\n"+
                    "6 - delete all elements in LL\n"+
                    "Input a number of step: ");
            n  = in.nextInt();
            switch (n) {
                case 1: {
                    in = new Scanner(System.in);
                    System.out.print("Input: ");
                    a = in.nextLine();
                    l.addFront(a);
                    break;
                }
                case 2: {
                    in = new Scanner(System.in);
                    System.out.print("Input a number to add at the end of the LinkedList: ");
                    a = in.nextLine();
                    l.addBack(a);
                    break;
                }
                case 3:
                    l.deleteFront();
                    break;
                case 4: {
                    in = new Scanner(System.in);
                    System.out.print("Input a number to delete: ");
                    a = in.nextLine();
                    l.deleteCurrent(a);
                    break;
                }
                case 5:
                    System.out.println(l.howMany());
                    break;
                case 6: 
                    l.deleteAll();
                    break;
            }
            l.printList();
        }
    }
}