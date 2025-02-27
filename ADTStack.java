public class ADTStack
{
    int numitems = 0;
    Node top = new Node();
    
    public void createList()
    {
    }
    
    public boolean isEmpty()
    {
        return(numitems==0);
    }
    
    public void push(int item)
    {
        top = new Node(item,top);
        numitems++;
    }
    
    public int pop()
    {
        numitems--;
        int i = top.getValue();
        top = top.getNext();
        return i;
    }
    
    public int peek()
    {
        return top.getValue();
    }
    
    public void display()
    {
        Node curr = top;
        while(curr != null)
        {
            System.out.println(curr.getValue());
            curr = curr.getNext();
        }
    }
}