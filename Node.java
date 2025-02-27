public class Node
{
    private int value;
    private Node next;
    
    public Node()
    {
        next = null;
    }
    
    public Node(int value)
    {
        this.value = value;
        next = null;
    }
    public Node(int value, Node next)
    {
        this.value = value;
        this.next = next;
    }
    
    public int getValue()
    {
        return value;
    }
    public Node getNext()
    {
        return next;
    }
    public void setValue(int z)
    {
        this.value = z;
    }
    public void setNext(Node z)
    {
        this.next = z;
    }
}