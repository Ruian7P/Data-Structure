public class TreeTraversal
{
    public static void main(String [] args)
    {
        Tree t = new Tree();
        t.build();
        System.out.println("preorder traversal");
        t.prefix();
        System.out.println("inorder traversal");
        t.infix();
        System.out.println("postorder traversal");
        t.postfix();
    }
}

class  Tree
{

    private Node root;

    public Tree ()
    {
        root = null;
    }

    private void leftChild(Node t, Object o)
    //create a left child for node t
    {
        t.left = new Node(o);
    }

    private void rightChild(Node t, Object o)
    //create a right child for node t
    {
        t.right = new Node(o);
    }

    public void build()
    {
        root =  new Node(new Character('a') );
        leftChild(root, new Character('b') );
        rightChild(root, new Character('c') );
        leftChild(root.left, new Character('d'));
        rightChild(root.left, new Character('e'));
    }

    public void prefix()  //used as a driver for real prefix method
    {
        prefix(root);
        System.out.println();
    }

    private void prefix(Node t)
    {
        if(t != null)
        {
            System.out.print(t);
            prefix(t.left);
            prefix(t.right);
        }
    }

    public void infix()  //used as a driver for real prefix method
    {
        infix(root);
        System.out.println();
    }

    private void infix(Node t)
    {
        if(t != null)
        {
            infix(t.left);
            System.out.print(t);
            infix(t.right);
        }
    }

    public void postfix()  //used as a driver for real postfix method
    {
        postfix(root);
        System.out.println();
    }

    private void postfix(Node t)
    {
        if(t != null)
        {
            postfix(t.left);
            postfix(t.right);
            System.out.print(t);
        }
    }

}
