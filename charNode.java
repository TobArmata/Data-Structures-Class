public class charNode
{
    private char value;
    private charNode next;
    
    public charNode(char value)
    {
        this.value = value;
        next = null;
    }
    public charNode(char value, charNode next)
    {
        this.value = value;
        this.next = next;
    }
    
    public char getitem()
    {
        return value;
    }
    public charNode getNext()
    {
        return next;
    }
    public void setitem(char z)
    {
        this.value = z;
    }
    public void setNext(charNode z)
    {
        this.next = z;
    }
}