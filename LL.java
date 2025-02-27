public class LL
{
    private Node head;
    private int numitems;
    
    public LL()
    {
        head = null;
        numitems = 0;
    }
    
    public LL(Node next)
    {
        head = next;
        numitems = 1;
    }
    
    public boolean isEmpty()
    {
        return(numitems == 0);
    }
    
    public int size()
    {
        return numitems;
    }
    
    public void add(Node a)
    {
        Node current = head;
        while(head.getNext() != null)
        {
            current = current.getNext();
        }
        current.setNext(a);
        numitems++;
    }
    
    public void remove(int loc)
    {
        Node current = head;
        for(int z = 0; z < loc; z++)
        {
            if(current.getNext() != null)
                current = current.getNext();
        }
        if(current.getNext() != null)
            current.setNext(current.getNext().getNext());
        else
            current.setNext(null);
    }
    
    public void removeAll()
    {
        head.setNext(null);
    }
    
    public int get(int z)
    {
        int w = 0;
        Node current = head;
        while(w <= z)
        {
            current = current.getNext();
            w++;
        }
        return current.getValue();
    }
    public void display()
    {
        Node current = head;
        while(current.getNext() != null)
        {
            System.out.print(current.getValue()+ " ");
            current.getNext(); 
        }
    }
}