public class ArrayStack
{
    int top = -1;
    int numitems = 0;
    int[] arr;
    
    public ArrayStack()
    {
        arr = new int[10];
    }
    
    public ArrayStack(int size)
    {
        arr = new int[size];
    }
    
    public boolean isEmpty()
    {
        return top==-1;
    }
    
    public int size()
    {
        return numitems;
    }
    
    public void add(int item)
    {
        top++;
        numitems++;
        arr[top] = item;
    }
    
    public int remove()
    {
        if(isEmpty())
        {
            numitems--;
            top--;
            return arr[top+1];
        }
        return -1;
    }
    
    public void removeAll()
    {
        numitems = 0;
        top = -1;
    }
    
    public int get()
    {
        return arr[top];
    }
}