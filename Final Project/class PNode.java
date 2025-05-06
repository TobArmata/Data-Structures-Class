public class PNode
{
    private paient value;
    private PNode next;
    
    public PNode()
    {
        value = null;
        next = null;
    }
    public PNode(paient c)
    {
        value = c;
        next = null;
    }
    public PNode(paient c, PNode n)
    {
        value = c;
        next = n;
    }
    
    public paient getCurrent()
    {
        return value;
    }
    
    public PNode getNext()
    {
        return next;
    }
    
    public void setCurrent(paient c)
    {
        value = c;
    }
    
    public void setNext(PNode n)
    {
        next = n;
    }
    
    
}
