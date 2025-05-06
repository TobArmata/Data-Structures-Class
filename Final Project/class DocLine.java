public class DocLine
{
    private PNode head;
    private int numitems;
    private String name;
    
    public DocLine(String n)
    {
        name = n;
    }
    
    public boolean isEmpty()
    {
        return(numitems == 0);
    }
    
    public int length()
    {
        return numitems;
    }
    
    public void add(paient pai)
    {
        PNode a = new PNode(pai,null);
        if(head == null)
        {
            head = a;
            numitems++;
        }
        else
        {
            PNode current = head;
            while(current.getNext() != null)
            {
                current = current.getNext();
            }
            current.setNext(a);
            numitems++;
        }
    }
    
    public void next(DisCharged a)
    {
        PNode curr = head;
        if(curr.getNext() != null)
        {
            System.out.println("Doctor "+ name);
            System.out.println(head.getCurrent().name+"\n"+head.getCurrent().id+"\n"+head.getCurrent().ins+"\n"+head.getCurrent().problem+"\n");
            a.add(head.getCurrent());
            head = head.getNext();
        }
        else
        {
            System.out.println("Doctor "+ name);
            System.out.println("There is no one next");
        }
    }
    
    public void remove(int loc)
    {
        PNode current = head;
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
    
    
    public void display()
    {
        System.out.println("Doctors "+ name+ " Full List");
        PNode curr = head;
        while(curr.getNext() != null)
        {
            System.out.println(curr.getCurrent().name+"\n"+curr.getCurrent().id+"\n"+curr.getCurrent().ins+"\n"+curr.getCurrent().problem+"\n");
            curr = curr.getNext();
        }
    }
}
