public class NodeTesting
{
    public static void main()
    {
        Node n5 = new Node(5,null);
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);
        
        Node top = n1;
        
        
        Node head = top;
        while(head.getNext() != null)
        {
            System.out.println(head.getValue());
            head = head.getNext();
        }
        
        System.out.println(head.getValue());
 
    }
}