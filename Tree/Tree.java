class Tree
{

    private Node root;

    public Tree ()
    {
        root = null;
    }

    private void leftChild(Node t, Object o)
    {
        t.left =  new Node(o);
    }

    private void rightChild(Node t, Object o)
    {
        t.right =  new Node(o);
    }
    
    public void build()
    {
        root =  new Node(new Character('a') );
        leftChild(root, new Character('b') );
        rightChild(root, new Character('c') );
        leftChild(root.left, new Character('d'));
        rightChild(root.left, new Character('e'));
        ......
    }

    public void prefix()
    {
        prefix(root);
        System.out.println();
    }

    private void prefix(Node t)
    {
       
    }


    public void infix() 
    {
        infix(root);
        System.out.println();
    }

    private void infix(Node t)
    {
    }

    public void postfix()  
    {
        postfix(root);
        System.out.println();
    }

    private void postfix(Node t)
    {
    }

    public int evaluate()
    {
        return evaluate(root);
    }

    private int evaluate(Node t)
    {
    }

}
