public class test 
{
    public static void main()
    {
        paient a = new paient("A","B","C","D");
        paient b = new paient("E","F","G","H");
        paient c = new paient("I","J","K","L");
        paient d = new paient("M","N","O","P");
        
        line lines = new line();
        
        DocLine Doclines = new DocLine("Chase");
        DisCharged DC = new DisCharged();
        
        lines.add(a);
        lines.add(b);
        lines.add(c);
        lines.add(d);
        System.out.println("-------------------------------------");
        lines.display();
        System.out.println("-------------------------------------");
        
        lines.next(Doclines);
        lines.next(Doclines);
        lines.next(Doclines);
        lines.next(Doclines);
        System.out.println("-------------------------------------");
        
        Doclines.display();
        System.out.println("-------------------------------------");
        
        Doclines.next(DC);
        Doclines.next(DC);
        Doclines.next(DC);
        Doclines.next(DC);
        System.out.println("-------------------------------------");
        
        DC.display();
        
        
    }
}
