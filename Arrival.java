import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Arrival
{
    private int numitems = 0;
    private Customer head;
    private Customer tail;
    
    public boolean isempty()
    {
        return(numitems==0);
    }
    
    public void addCustomer(int a, int s, String name)
    {
        Customer c = new Customer(a,s,name);
        if (head == null)
        {
            head = c;
        }
        tail = c;

    }
    
    public void removeCustomer()
    {
         head = head.getNext();
    }
    
    public Customer nextCustomer()
    {
        return head;
    }
   
    public void readArrivals(String input)
    {
        try (Scanner scan = new Scanner (new File(input)))
        {
            while (scan.hasNextLine())
            {
                int a = scan.nextInt();
                int s = scan.nextInt();
                String n = scan.next();
            }
        }
        catch(FileNotFoundException fail)
        {
            fail.printStackTrace();
        }
    }
    public void displayArrivalList()
    {
        Customer c = head;
        while (c.getNext() != null)
        {
            System.out.print(c.getArivalTime()+" ");
            System.out.print(c.getServiceTime()+" ");
            System.out.println(c.getNext());
            c = c.getNext();
        }

    }
}\