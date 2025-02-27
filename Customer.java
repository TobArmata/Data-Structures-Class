public class Customer
{
    private int ArivalTime = 0;
    private int ServiceTime = 0;
    private String CustomerName = "";
    private Customer next;
    
    public Customer()
    {
        ArivalTime = 0;
        ServiceTime = 0;
        CustomerName = "";
        next = null;
    }
    public Customer(int a, int s ,String c, Customer t)
    {
        ArivalTime = a;
        ServiceTime = s;
        CustomerName = c;
        next = t;
    }
    public Customer(int a, int s ,String c)
    {
        ArivalTime = a;
        ServiceTime = s;
        CustomerName = c;
        next = null;
    }
    
    public int getArivalTime()
    {
        return ArivalTime;
    }
    public int getServiceTime()
    {
        return ServiceTime;
    }
    public String getCustomerName()
    {
        return CustomerName;
    }
    public Customer getNext()
    {
        return next;
    }
    
    public void setArivalTime(int a)
    {
        ArivalTime = a;
    }
    public void setServiceTime(int s)
    {
        ServiceTime = s;
    }
    public void setCustomerName(String c)
    {
        CustomerName = c;
    }
    public void setNext(Customer t)
    {
        this.next = t;
    }
}
