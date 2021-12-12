class BinaryTree {
    int data;
    BinaryTree parent;
    BinaryTree left;
    BinaryTree right;

    public BinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public static int size = 0, depth = 0;
    BinaryTree ROOT;

    public BinaryTree() {
        this.ROOT = null;
    }

    public int depth(BinaryTree element, int tmp) {
        if (tmp > depth)
            depth = tmp;

        if (element != null) {
            depth(element.left, tmp++);
            depth(element.right, tmp++);
            tmp--;
        } else
            tmp--;
        return depth;
    }

    /*public int depth() {
        return depth(ROOT);
    }

    private int depth(BinaryTree element) {
        if (element == null)
            return 0;
        else
            return 1 + Math.max(depth(element.left), depth(element.right));
    }*/

    void insertNode(BinaryTree element, int data) {
        if (ROOT == null) { //если ROOT ещё не установлен то мы его устанавливаем и начинаем ветвление дерева
            element = new BinaryTree(data);
            ROOT = element;
            size = 1;
        }
        else if (data < element.data && element.left == null) {
            element.left = new BinaryTree(data);
            element.left.parent = element;
            size++;
        }
        else if (data >= element.data && element.right == null) {
            element.right = new BinaryTree(data);
            element.right.parent = element;
            size++;
        }
        else {
            if (data < element.data)
                insertNode(element.left, data);
            else
                insertNode(element.right, data);
        }
    }

    public boolean search(BinaryTree node, int data) {
        if (node == null)
            return false;
        else if (node.data == data)
            return true;
        else {
            if (data < node.data)
                return search(node.left, data);
            else
                return search(node.right, data);
        }
    }

    public void printInOrder(BinaryTree element) {
        if (element != null) {
            printInOrder(element.left);
            System.out.print(element.data + ", ");
            printInOrder(element.right);
        }
    }

    public void deleteTree(BinaryTree node)
    {
        if (node != null) {
            ROOT = null;
        }
    }
}