import java.util.Scanner;

class TestBinaryTree {
    public static void main(String[] args)
    {
        BinaryTree newTree = new BinaryTree();

        newTree.insertNode(newTree.ROOT, 20);
        newTree.insertNode(newTree.ROOT, 5);
        newTree.insertNode(newTree.ROOT, 25);
        newTree.insertNode(newTree.ROOT, 3);
        newTree.insertNode(newTree.ROOT, 7);
        newTree.insertNode(newTree.ROOT, 27);
        newTree.insertNode(newTree.ROOT, 24);

        newTree.insertNode(newTree.ROOT, 28);
        newTree.insertNode(newTree.ROOT, 29);
        newTree.insertNode(newTree.ROOT, 30);
        newTree.insertNode(newTree.ROOT, 31);


        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print ("""
                    1 - add an element
                    2 - search for an element
                    3 - delete all elements
                    4 - show the tree
                    5 - size of tree
                    6 - depth of tree
                    """);
            switch (in.nextInt()) {
                case 1:
                    System.out.println ("Enter which element to add:");
                    newTree.insertNode(newTree.ROOT, in.nextInt());
                    break;
                case 2:
                    System.out.println ("Enter which element to search for:");
                    System.out.println(newTree.search(newTree.ROOT, in.nextInt()) ? "Found" : "Not Found");
                    break;
                case 3: newTree.deleteTree(newTree.ROOT); break;
                case 4:
                    newTree.printInOrder(newTree.ROOT);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Size of tree = " + BinaryTree.size + "\n"); break;
                case 6: System.out.println("Tree depth = " + newTree.depth(newTree.ROOT, 0)); break;
            }
        }
    }
}