class  Node
{
    Node left;
    Node right;
    Object element;

    public Node (Object o)
    {
        this (o, null, null);
    }

    public Node (Object o, Node l, Node r)
    {
        element = o;
        left = l;
        right = r;
    }

    public String toString()
    {
        return "" + element;
    }
}
